package com.example.rajap.buttonplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
	private TextView textView;
	private int numTimesClicked = 0;
	private static final String TAG = "MainActivity";
	private final String TEXT_CONTENTS = "TextContents";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		Log.d(TAG,"onCreate: start");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final EditText userInput = findViewById(R.id.editText);
		userInput.setText("");
		View button = findViewById(R.id.button);
		textView = findViewById(R.id.textView2);
		textView.setText("");
		textView.setMovementMethod(new ScrollingMovementMethod());
		View.OnClickListener myOnClickListener = new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				/*
				numTimesClicked += 1;
				String result = " The Button got tapped " + numTimesClicked + " time";
				if(numTimesClicked != 1)
				{
					result += "s";
				}
				textView.append(result);
				String text = userInput.getText().toString();
				if(text != "")
				{
					textView.append("\n" + text + "\n");
				}
				else
				{
					textView.append("\n");
				}
				userInput.setText("");

				Toast toast = Toast.makeText(getApplicationContext(),"Button Pressed",Toast.LENGTH_LONG);
				toast.show();*/

				Intent newActivity = new Intent(MainActivity.this, ActivityTwo.class);
				startActivity(newActivity);
			}
		};
		if(button != null)
		{
			button.setOnClickListener(myOnClickListener);
		}
		Log.d(TAG,"onCreate: end");
	}

	@Override
	protected void onStart()
	{
		Log.d(TAG,"onStart: start");
		super.onStart();
		Log.d(TAG,"onStart: end");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState)
	{
		Log.d(TAG,"onRestoreInstatnceState: start");
		super.onRestoreInstanceState(savedInstanceState);
//		String savedString = savedInstanceState.getString(TEXT_CONTENTS);
//		textView.setText(savedString);
		textView.setText(savedInstanceState.getString(TEXT_CONTENTS));
		Log.d(TAG,"onRestoreInstatnceState: end");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState)
	{
		outState.putString(TEXT_CONTENTS, textView.getText().toString());
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onPause()
	{
		super.onPause();
	}

	@Override
	protected void onRestart()
	{
		Log.d(TAG,"onRestart: start");
		super.onRestart();
		Log.d(TAG,"onRestart: end");
	}
}
