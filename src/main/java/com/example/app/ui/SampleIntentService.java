package com.example.app.ui;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.example.app.objects.ITestable;
import dagger.ObjectGraph;

import javax.inject.Inject;

public class SampleIntentService extends IntentService {

    @Inject ITestable testable;


    public SampleIntentService() {
        super("SampleIntentService");

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        ObjectGraph.create(new DefaultModule(getApplicationContext())).inject(this);

        String msg = testable.getString();
        Log.d("DaggerTests", msg);
    }
}
