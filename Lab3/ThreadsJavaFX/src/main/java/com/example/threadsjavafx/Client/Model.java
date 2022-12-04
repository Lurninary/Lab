package com.example.threadsjavafx.Client;

import java.net.*;
import java.io.*;

public class Model implements IModel{

    Socket s;
    InputStream in;
    OutputStream out;

    @Override
    public void some_calc(Updatable updater) {
        try {
            s = new Socket("127.0.0.1", 1111);
            in = s.getInputStream();
            out = s.getOutputStream();
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void Send(String str, int len)
    {
        char[] chars = new char[10];
        for (int i = 0; i < 10; i++)
        {
            chars[i] = (i < len) ? str.charAt(i) : '0';
            try
            {
                out.write(chars[i]);
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
    @Override
    public void stop(){
        Send("Stop",4);
    }

    @Override
    public void pause() {
        Send("Pause",5);
    }

    @Override
    public void resume() {
        Send("Resume",5);
    }

    @Override
    public void isAlive() {
        Send("isAlive", 7);
    }
}




