package com.example.musicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button b1;
	Button b2;
	MediaPlayer mp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button) findViewById(R.id.obj1);
		b2 = (Button) findViewById(R.id.obj2);
		mp = MediaPlayer.create(this, R.raw.p);
	}

	public void a(View v) {
		switch (v.getId())
		{
		case R.id.obj1:mp.start();
			break;
		case R.id.obj2:mp.pause();
			break;

		}
	}
}
