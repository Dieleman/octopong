package com.example.dennis.octapong;

import android.util.Log;

/**
 * Created by Dennis on 25-11-2014.
 */
public class MainThread extends Thread {

    private static final String TAG = MainThread.class.getSimpleName();

    // flag to hold game state
    private boolean running;
    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        while (running) {
            // update game state
            // render state to the screen
            Log.d(TAG,"Is running");
        }
        Log.d(TAG,"Is not running");
    }
}
