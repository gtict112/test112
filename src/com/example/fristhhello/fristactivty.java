package com.example.fristhhello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class fristactivty extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fristactivty);
		Button btn1 = (Button)findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener()
				{

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
//						Intent intent = new Intent("android.intent.ACTION_VIEW");
//						intent.setData(Uri.parse("https://www.baidu.com"));
//						startActivity(intent);
//					String str ="fristact from";
//					Intent intent = new Intent(fristactivty.this,second.class);
//					intent.putExtra("exatr_data", str);
//					startActivity(intent);
					person person1 = new person();
					person1.setname("tom");
					person1.setage(12);
					Intent intent = new Intent(fristactivty.this,second.class);
					intent.putExtra("person_data", person1);
					startActivity(intent);
					
					}
				}
				);

	}

//	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.testmenu, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected (MenuItem item)
	{
		switch(item.getItemId())
		{
		case R.id.item1:
		Toast.makeText(fristactivty.this,"hhhh", Toast.LENGTH_SHORT).show();
		case R.id.item2:
		Toast.makeText(fristactivty.this,"hhhh22", Toast.LENGTH_SHORT).show();
		default:
			break;
		}
		return true;
	}

}
