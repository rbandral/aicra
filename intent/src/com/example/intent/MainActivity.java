package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView t1;
	EditText e1;
	TextView t2;
	EditText e2;
	Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t1 = (TextView) findViewById(R.id.obj1);
		e1 = (EditText) findViewById(R.id.obj2);
		t2 = (TextView) findViewById(R.id.obj3);
		e2 = (EditText) findViewById(R.id.obj4);
		b1 = (Button) findViewById(R.id.obj5);
	}

	public void a(View v) {
		String x, y;
		x = e1.getText().toString();
		y = e2.getText().toString();
		if (x.matches("rahulkumar") && y.matches("password")) {
			Intent i = new Intent(this, second.class);
			startActivity(i);
		} else {
			Toast.makeText(this, "enter correct password", Toast.LENGTH_SHORT)
					.show();
		}

	}

}
