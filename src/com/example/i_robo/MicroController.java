package com.example.i_robo;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MicroController extends Activity implements OnClickListener {

	Button back,exit;
	ListView listView;
	ArrayList<String>item;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_micro_controller);
		back=(Button) findViewById(R.id.BtnBack);
		exit=(Button) findViewById(R.id.ExitBtn);
		back.setOnClickListener(this);
		exit.setOnClickListener(this);
		
	
		
		listView=(ListView) findViewById(R.id.listView1);
		
		    item=new ArrayList<String>();
			item.add("1.Scrolling display");
			item.add("2.7 Segment Led Display");
			item.add("3.IR object Detector");
			
			 ArrayAdapter<String>adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,item);
			 listView.setAdapter(adapter);
		
		
		
		 
	     listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View v, int position,
			long arg3)
			{
			if(position==0){
				Intent lfrIntent=new Intent(MicroController.this,ScrollingDislpay.class);
				startActivity(lfrIntent);
			}
			else if(position==1){
				Intent lfrIntent=new Intent(MicroController.this,SevenSigmentDisplay.class);
				startActivity(lfrIntent);
			}
			else if(position==2){
				Intent lfrIntent=new Intent(MicroController.this,IRobjectDetector.class);
				startActivity(lfrIntent);
			}
			}
			});
		
		
	}
	 
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.BtnBack:
			Intent intent=new Intent(MicroController.this,Project_type.class); 
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
