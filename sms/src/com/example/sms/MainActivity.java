package com.example.sms;

import android.os.Bundle;
import android.provider.Telephony.Sms;
import android.app.Activity;
import android.telephony.gsm.SmsManager;
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t1 = (TextView) findViewById(R.id.obj1);
		e1 = (EditText) findViewById(R.id.obj2);
		t2 = (TextView) findViewById(R.id.obj3);
		e1 = (EditText) findViewById(R.id.obj4);
		b1 = (Button) findViewById(R.id.obj5);

	}

	public void a(View v) {
		String a, b;
		a = e1.getText().toString();
		b = e2.getText().toString();
		SmsManager s = SmsManager.getDefault();
		s.sendTextMessage(b, null, a,null, null );

	}

}
