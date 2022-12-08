package com.example.threadsjavafx;

import java.io.IOException;

public interface IModel {
    void some_calc(Updatable updater) throws IOException;
    void stop();
    void pause();
    void resume();
    void isAlive();
    void Send(String str, int len);
}
