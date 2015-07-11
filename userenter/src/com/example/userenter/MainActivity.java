package com.example.userenter;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView t1;
	EditText e1;
	TextView t2;
	EditText e2;
	Button b1;
	TextView t3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t1 = (TextView) findViewById(R.id.obj0);
		e1 = (EditText) findViewById(R.id.obj1);
		t2 = (TextView) findViewById(R.id.obj2);
		e2 = (EditText) findViewById(R.id.obj3);
		b1 = (Button) findViewById(R.id.obj4);
		t3 = (TextView) findViewById(R.id.obj5);
	}

	public void p(View v) {
		int a, b, c;
		a=Integer.parseInt(e1.getText().toString());
		b=Integer.parseInt(e2.getText().toString());
		c=a+b;
		t3.setText(c+"is result");

			
		
	}

}
