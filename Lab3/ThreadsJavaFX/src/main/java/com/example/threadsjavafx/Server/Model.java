package com.example.threadsjavafx.Server;

import java.net.*;
import java.io.*;

public class Model implements IModel{
    ServerSocket ss;
    Socket s;

    InputStream in;
    OutputStream out;

    Calc c;

    @Override
    public void some_calc(Updatable updater) {
        try {
            ss = new ServerSocket(1111);
            s = ss.accept();

            in = s.getInputStream();
            out = s.getOutputStream();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
        if(c != null)
            c.CalcStop();
        c = new Calc(updater);
        c.start();
        while (true)
        {
            TakeData();
        }
    }

    @Override
    public void TakeData()
    {
        char[] chars = new char[10];
        char temp;
        int len = 0;
        for (int i = 0; i < 10; i++)
        {
            try
            {
                temp = (char) in.read();
                if (temp != '0')
                {
                    chars[i] = temp;
                    len++;
                }
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }

        char[] string = new char[len];
        for (int i = 0; i < len; i++)
        {
            string[i] = chars[i];
        }
        String str = new String(string);



        switch (str) {
            case ("isAlive") ->
            {
                c.isAlive();
            }
            case ("CalcResume") -> c.CalcResume();
            case ("CalcPause") -> c.CalcPause();
            case ("CalcStop") -> c.CalcStop();
        }
    }
}


class Calc extends Thread{

    boolean Stop;
    boolean Pause;
    boolean Resume;

    Updatable updater;


    public Calc(Updatable updater)
    {
        this.updater = updater;
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

            updater.update((double) i / 1000);
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

