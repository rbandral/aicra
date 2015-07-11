package com.example.optionmenue;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
	LinearLayout la;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		la = (LinearLayout) findViewById(R.id.obj3);
		registerForContextMenu(la);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater c = getMenuInflater();
		c.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);

	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.obj1:Toast.makeText(this, "yoyo", Toast.LENGTH_SHORT).show();
			
			break;
		case R.id.obj2:Toast.makeText(this, "Bohemia", Toast.LENGTH_SHORT).show();

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
