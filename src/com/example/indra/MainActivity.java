package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE_FROM = "com.example.indra.MESSAGE_FROM";
	public final static String EXTRA_MESSAGE_TO = "com.example.indra.MESSAGE_TO";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	public void getRoute(View view){
		
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText from_station = (EditText) findViewById(R.id.from_station);
		EditText to_station = (EditText) findViewById(R.id.to_station);
		
		String msg_from_station = from_station.getText().toString();
		String msg_to_station = to_station.getText().toString();
		
		intent.putExtra(EXTRA_MESSAGE_FROM, msg_from_station);
		intent.putExtra(EXTRA_MESSAGE_TO, msg_to_station);
		
		startActivity(intent);
		
	}

}
