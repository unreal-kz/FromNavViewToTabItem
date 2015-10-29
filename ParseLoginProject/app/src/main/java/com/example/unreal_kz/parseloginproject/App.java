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
        Parse.initialize(this, "Application ID", "Client Key");
    }
}
