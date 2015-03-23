package com.myproj.first;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	static
	{
		System.loadLibrary("mylib");
	}
	
	public native String getMyData();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setTitle(getMyData());
	}
}
