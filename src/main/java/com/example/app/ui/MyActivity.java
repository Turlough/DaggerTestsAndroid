package com.example.app.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.example.app.R;
import com.example.app.objects.ISettings;
import com.example.app.objects.ITestable;
import dagger.ObjectGraph;

import javax.inject.*;

public class MyActivity extends Activity {

    @Inject    ITestable testable;
    @Inject    ISettings settings;
    TextView text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ObjectGraph.create(new DefaultModule(getApplicationContext())).inject(this);

        writeText();
        launchIntent();
    }

    private void launchIntent() {
        Intent i = new Intent(this, SampleIntentService.class);
        startService(i);
    }

    public void writeText(){
        text = (TextView) findViewById(R.id.text);
        String url = settings.getBaseUrl();
        text.setText(url);

    }





}
