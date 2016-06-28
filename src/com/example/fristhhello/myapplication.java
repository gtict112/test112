package com.example.fristhhello;

import android.app.Application;
import android.content.Context;

public class myapplication extends Application {
	private static Context context;
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		context = getApplicationContext();
	}
	public static Context getcontext()
	{
		return context;
	}
}
