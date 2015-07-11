package com.example.simplecalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView t1, t2, t3;
	EditText e1, e2;
	Button b1, b2, b3, b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t1 = (TextView) findViewById(R.id.obj0);
		e1 = (EditText) findViewById(R.id.obj1);
		t2 = (TextView) findViewById(R.id.obj2);
		e2 = (EditText) findViewById(R.id.obj3);
		b1 = (Button) findViewById(R.id.obj4);
		b2 = (Button) findViewById(R.id.obj5);
		b3 = (Button) findViewById(R.id.obj6);
		b4 = (Button) findViewById(R.id.obj7);
		t3 = (TextView) findViewById(R.id.obj8);

	}

	public void p(View v) {
		int a, b, c, d, s, m;
		a = Integer.parseInt(e1.getText().toString());
		b = Integer.parseInt(e2.getText().toString());

		switch (v.getId()) {
		case R.id.obj4:
			c = a + b;

			t3.setText(c + " ");
			e1.setText(" ");
			e2.setText(" ");

			break;
		case R.id.obj5:

			d = a - b;

			t3.setText(d + " ");
			e1.setText(" ");
			e2.setText(" ");
			break;
		case R.id.obj6:

			s = a * b;

			t3.setText(s + " ");
			e1.setText(" ");
			e2.setText(" ");
			break;
		case R.id.obj7:

			m = a / b;
			t3.setText(m + " ");
			e1.setText(" ");
			e2.setText(" ");
			break;

		default:

			break;
		}

	}

}