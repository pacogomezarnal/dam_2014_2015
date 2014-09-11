package com.example.lanzarmapa;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        final Button boton=(Button) findViewById(R.id.button1);
        
        boton.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View v) {
					Intent mapa = new Intent(
							android.content.Intent.ACTION_VIEW,
							Uri.parse("geo:0,0?q=Blasco+Iba�ez+Valencia+Espa�a")
							);
					startActivity(mapa);
					
				}
        
        	}
        
        );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}