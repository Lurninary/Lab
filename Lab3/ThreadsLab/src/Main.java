package com.company;



class Thread1 implements Runnable{

    private String msg;

    public Thread1(String m){
        this.msg = m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        do {
            synchronized (msg) {
                msg.notify();
                try {
                    msg.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }while(true);
    }
}



public class Main {
    public static void main(String[] args) {
        String msg = "1";
        Thread1 thread1 = new Thread1(msg);
        new Thread(thread1,"Thread1").start();

        Thread1 thread2 = new Thread1(msg);
        new Thread(thread2, "Thread2").start();
    }
}
