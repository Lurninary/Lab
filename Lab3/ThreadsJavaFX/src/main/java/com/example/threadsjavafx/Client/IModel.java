package com.example.threadsjavafx.Client;

public interface IModel {
    void some_calc(Updatable updater);
    void stop();
    void pause();
    void resume();
    void isAlive();
    void Send(String str, int len);
}
