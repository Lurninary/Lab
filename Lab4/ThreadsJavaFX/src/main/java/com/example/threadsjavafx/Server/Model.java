package com.example.threadsjavafx.Server;

import java.net.*;
import java.io.*;
import java.nio.ByteBuffer;

public class Model {
    private static ServerSocket ss;
    private static Socket s;

    private static InputStream in;
    private static OutputStream out;

    private static Calc c;
    private static double Value;

    public static void main(String[] args) throws IOException {
        try {
            ss = new ServerSocket(1111);
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");
            s = ss.accept();
            System.out.println("Client accepted");
            in = s.getInputStream();
            out = s.getOutputStream();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
        if(c != null) c.CalcStop();

        Runnable TakeThread = () ->
        {
            Thread.currentThread().setName("TakeThread");
            System.out.println("Server Take");
            while (true) {
                synchronized (System.out) {
                    char[] chars = new char[10];
                    char temp;
                    int len = 0;
                    for (int i = 0; i < 10; i++) {
                        try {
                            temp = (char) in.read();
                            if (temp != '0') {
                                chars[i] = temp;
                                len++;
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    char[] string = new char[len];
                    for (int i = 0; i < len; i++) {
                        string[i] = chars[i];
                    }
                    String str = new String(string);


                    switch (str) {
                        case ("isAlive") -> c.isAlive();
                        case ("CalcResume") -> c.CalcResume();
                        case ("CalcPause") -> c.CalcPause();
                        case ("CalcStop") -> c.CalcStop();
                    }
                }
            }
        };

        Thread Take = new Thread(TakeThread);
        Take.start();
        System.out.println("Take Thread Started");

        c = new Calc();
        c.start();
        System.out.println("Calc Thread Started");

        while (true)
        {
            Send(c.Calc());
        }
    }

    public static void Send(double value) throws IOException
    {
        System.out.println("Server Send");
        byte[] array = new byte[8];
        ByteBuffer.wrap(array).putDouble(value);
        out.write(array);
    }
}


class Calc extends Thread{

    boolean Stop;
    boolean Pause;
    boolean Resume;

    Double updater = 0.0;


    public double Calc()
    {
        return updater;
    }

    void CalcStop(){
        Stop=true;
    }

    void CalcPause(){
        Pause=true;
        Resume=false;
    }

    void CalcResume(){
        Resume=true;
        Pause=false;

    }

    @Override
    public void run() {
        for(int i = 0; i< 1000; i++){
            if (Stop) break;
            if (Pause)
            {
                try {
                    synchronized (System.out)
                    {
                        System.out.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            if (Resume)
            {
                synchronized (System.out)
                {
                    System.out.notify();
                }

            }

            updater = (double) i / 1000;
            System.out.println(updater);
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

