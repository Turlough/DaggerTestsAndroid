package com.example.app.ui;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.example.app.objects.ISettings;
import com.example.app.objects.ITestable;
import dagger.ObjectGraph;

import javax.inject.Inject;

public class SampleIntentService extends IntentService {

    @Inject ITestable testable;
    @Inject ISettings settings;


    public SampleIntentService() {
        super("SampleIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        ObjectGraph.create(new DefaultModule(getApplicationContext())).inject(this);

        String msg = testable.getString() + "/" + settings.getTagCode();
        Log.d("DaggerTests", msg);
    }
}
