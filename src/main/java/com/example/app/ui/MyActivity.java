package com.example.app.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.example.app.R;
import com.example.app.objects.ITestable;
import dagger.ObjectGraph;

import javax.inject.*;

public class MyActivity extends Activity {

    @Inject
    ITestable testable;
    TextView text;
    ObjectGraph graph;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        graph = ObjectGraph.create(new DefaultModule());
        graph.inject(this);

        writeText();
        doToast();
    }

    private void doToast() {
        Intent i = new Intent(this, SampleIntentService.class);
        startService(i);
    }

    public void writeText(){
        text = (TextView) findViewById(R.id.text);
        text.setText(testable.getString());

    }





}
