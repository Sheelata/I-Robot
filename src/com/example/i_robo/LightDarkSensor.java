package com.example.i_robo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LightDarkSensor extends Activity implements OnClickListener {
TextView procedure,aparatus;
ImageView imageView;
Button back,exit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_light_dark_sensor);
		procedure=(TextView) findViewById(R.id.procidure);
		aparatus=(TextView) findViewById(R.id.apparetus);
		imageView=(ImageView) findViewById(R.id.imageView1);
		
		
		back=(Button) findViewById(R.id.BtnBack);
		exit=(Button) findViewById(R.id.ExitBtn);
		back.setOnClickListener(this);
		exit.setOnClickListener(this);
		
	     }

 

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.BtnBack:
			Intent intent=new Intent(LightDarkSensor.this,SimpleProject.class); 
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
