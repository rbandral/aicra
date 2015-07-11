package com.example.splashstu;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Thread run = new Thread(){
			public void run() {
				try{
					sleep(4000);
				}
				catch(InterruptedException e){
					e.getStackTrace();
				}
                finally {
                    Intent i=new Intent(MainActivity.this,Second.class);
                    startActivity(i);
                }
            }
		};
        run.start();
	}


}
