package com.example.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends Activity {
	TextView t1;
	Button ba;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		t1 = (TextView) findViewById(R.id.obj6);
		ba = (Button) findViewById(R.id.b1);
	}

	public void a(View v) {
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
	}

}
