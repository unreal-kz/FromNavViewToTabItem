package com.example.unreal_kz.parseloginproject;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Unreal_KZ on 29.10.2015.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "dF4NP9rK7jwQ82eifOpTfMD9bkvBm9xsI8k3llZr", "RtCUIY05oAerQpUyeQyx8cAruubaYUoUOKbSzuvy");
    }
}
