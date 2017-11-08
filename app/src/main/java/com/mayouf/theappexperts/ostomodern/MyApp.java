package com.mayouf.theappexperts.ostomodern;

import android.app.Application;
import android.content.Context;

/**
 * Created by Mohammed on 01/10/2017.
 */

public class MyApp extends Application {


    public static Application sApplication;


    public static Application getApplication() {
        return sApplication;
    }

    public static Context getContext() {
        return getApplication().getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;

/*
        iApplicationComponent = DaggerIApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        getiApplicationComponent().inject(this);*/

    }
}