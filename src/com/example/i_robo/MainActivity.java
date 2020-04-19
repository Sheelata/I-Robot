package com.example.i_robo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
private Button continueButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		continueButton=(Button) findViewById(R.id.continurButton);
		
     continueButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		        Intent intent=new Intent(MainActivity.this,Project_type.class);
				 startActivity(intent);
				
			}
		});
	}
	@Override
	public void onBackPressed() {
		new AlertDialog.Builder(this)
		.setTitle(getTitle().toString())
		//­ .setIcon(R.drawable.ic_­launcher)
		.setMessage("Do you want to exit?")
		.setCancelable(true)
		.setPositiveButton("­Yes",
		new DialogInterface.OnClickListener() {
		public void onClick(DialogInterface dialog, int id) {
			MainActivity.this.finish();
		}
		}).setNegativeButton("No", null).show();
		}
 
}
