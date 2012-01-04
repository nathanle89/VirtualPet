package com.virtualPet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class VirtualPetActivity extends Activity implements View.OnClickListener {
	/** Called when the activity is first created. */
	private Button button;
	private int counter = 0;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		button=new Button(this);
		button.setOnClickListener(this);
		setContentView(button);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		counter++;
		button.setText("Counter: " + counter);
	}
}