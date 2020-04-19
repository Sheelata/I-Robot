package com.example.i_robo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class IRobjectDetector extends Activity implements OnClickListener{
	Button back,exit;
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_irobject_detector);
		
		back=(Button) findViewById(R.id.BtnBack);
		exit=(Button) findViewById(R.id.ExitBtn);
		back.setOnClickListener(this);
		exit.setOnClickListener(this);
		
		
	}

	 
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.BtnBack:
			Intent intent=new Intent(IRobjectDetector.this,MicroController.class); 
			startActivity(intent);
			break;
 	//..................................................................
		case R.id.ExitBtn:
			new AlertDialog.Builder(this)
			.setTitle("i-ROBO".toString())
			//­ .setIcon(R.drawable.ic_­launcher)
			.setMessage("Do you want to exit?")
			.setCancelable(true)
			.setPositiveButton("Yes",
			new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				AppExit();
			}
			}).setNegativeButton("No", null).show();
			
			break;

		default:
			break;
		}
	
	}
	@Override
	public void onBackPressed() {
		new AlertDialog.Builder(this)
		.setTitle("i-ROBO".toString())
		//­ .setIcon(R.drawable.ic_­launcher)
		.setMessage("Do you want to exit?")
		.setCancelable(true)
		.setPositiveButton("Yes",
		new DialogInterface.OnClickListener() {
		public void onClick(DialogInterface dialog, int id) {
			AppExit();
		}
		}).setNegativeButton("No", null).show();
		}
	

	
	public void AppExit()
	{

	    this.finish();
	    Intent intent = new Intent(Intent.ACTION_MAIN);
	    intent.addCategory(Intent.CATEGORY_HOME);
	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	    startActivity(intent);
 
	  }
 ///.....................................................................

}