package com.example.fristhhello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second);
//		Intent intent = getIntent();
//		String data =intent.getStringExtra("exatr_data");
		person person1 = (person) getIntent().getSerializableExtra("person_data");
		Log.d("frist", person1.getname() +person1.getAge());
	}


	
}
