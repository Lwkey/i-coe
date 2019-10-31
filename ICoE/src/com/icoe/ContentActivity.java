package com.icoe;

import android.webkit.WebView;
import android.app.Activity; 
import android.os.Bundle; 
 
public class ContentActivity extends Activity { 
 
    @Override     
    protected void onCreate(Bundle savedInstanceState) {         
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_content); 
    	WebView wv;        
    	wv = (WebView) findViewById(R.id.webView1);         
    	wv.loadUrl("file:///android_asset/main.html");     
    	} 
    } 
 