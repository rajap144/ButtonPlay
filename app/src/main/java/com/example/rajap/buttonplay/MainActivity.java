package com.example.rajap.buttonplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{

	private EditText userInput;
	private Button button;
	private TextView textView;
	private int numTimesClicked = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		userInput = findViewById(R.id.editText);
		button = findViewById(R.id.button);
		textView = findViewById(R.id.textView2);
		View.OnClickListener myOnClickListener = new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				numTimesClicked += 1;
				String result = "\n The Button got tapped " + numTimesClicked + "times.";
				textView.append(result);

			}
		};
		button.setOnClickListener(myOnClickListener);
	}
}
