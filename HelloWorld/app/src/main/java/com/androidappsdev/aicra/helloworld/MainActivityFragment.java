 package com.androidappsdev.aicra.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {
      Button b1;
     TextView t1;
     EditText e1;
    @Override
    protected Void onCreateView(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.obj3);
        t1 = (TextView) findViewById(R.id.obj2);
        e1 = (EditText) findViewById(R.id.obj1);
    }
    public void a(View v)
    {
        t1.setText("hello");
        e1.setText("world");
        b1.setText("android");
    }



}
