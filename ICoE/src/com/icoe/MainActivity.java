package com.icoe;

import android.view.View; 
import android.app.Activity; 
import android.content.Intent; 
import android.os.Bundle; 
 
public class MainActivity extends Activity { 
 
    @Override     
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);         
    	setContentView(R.layout.activity_main);     
    	}     
    public void switchToContent(View clickedButton) {   
    	Intent activityIntent = new Intent(this, ContentActivity.class);   
    	startActivity(activityIntent);  
    	} 
 } 