package com.example.login;

import com.example.login.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
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
	TextView t4;
	TextView t5;
	TextView t6;

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
		t4 = (TextView) findViewById(R.id.obj6);

	}

	public void p(View v) {
		int b;
		String a;
		a = e1.getText().toString();

		b = Integer.parseInt(e2.getText().toString());
		if (a.matches("rahul") && (b == 1234)) {
			t3.setText("password is correct");

		} else {
			t4.setText("password is incorrect");
			t3.setText("");
			e1.setText("");
			e2.setText("");
		}

	}

}
