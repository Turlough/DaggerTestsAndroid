package com.example.app.ui;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SampleIntentService extends IntentService {

    public SampleIntentService() {
        super("SampleIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String msg = "boo";
        Log.d("DaggerTests", msg);
        Context c = getApplicationContext();

    }
}
