package com.example.loginimage;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	ImageView e1;
	Button b1;
	TextView t1;
	EditText e2;
	int i=-1;

	int x[] = { R.drawable.har, R.drawable.rah };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		e1 = (ImageView) findViewById(R.id.obj4);
		t1 = (TextView) findViewById(R.id.obj1);
		e2 = (EditText) findViewById(R.id.obj2);
		b1 = (Button) findViewById(R.id.obj3);

	}

	public void a(View v) {
		String b;
		b = e2.getText().toString();
		if (b.matches("student")) {
			i++;

			if(i>1) {
				i=0;
				e1.setImageResource(x[i]);
			}
			else
			{
				e1.setImageResource(x[i]);
			}
		}
	}
}
