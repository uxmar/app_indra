package com.example.indra;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		//Show the Up button in the action bar.		

		setupActionBar();
		
		String AA;
		AA = "Hola Gaby";
		
		//Get the message from the intent 
		Intent intent = getIntent();
		String msg_from = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_FROM);
		String msg_to = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_TO);
		
		LinearLayout options = new LinearLayout(this);
		
		//Create the text view
		TextView textViewFrom = new TextView(this);
		textViewFrom.setTextSize(40);
		textViewFrom.setText(msg_from);

		//Create the text view 
		TextView textViewTo = new TextView(this);
		textViewTo.setTextSize(40);
		textViewTo.setText(AA);
		
		
		options.addView(textViewFrom);
		options.addView(textViewTo);

		setContentView(options);
		
		
		
		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
