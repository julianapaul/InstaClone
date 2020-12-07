package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XnAGVfYYnz62WtLydJSClPT5RRxCPAGR47IyMJ4x")
                .clientKey("DtSohyVAeKyuBL2CfhCN9vWMZGsLyvcZkn52ZHEH")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
