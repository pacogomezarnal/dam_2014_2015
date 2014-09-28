package com.example.dobleventana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {

	private static final String TAG = "Segunda Ventana";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		//Capturamos el Intent que llamo a esta ventana
		Intent primera=getIntent();
		
		//REcuperamos y colocamos la informaci�n de cada uno de los datos
        final TextView user=(TextView) findViewById(R.id.TextView02);
        final TextView passwd=(TextView) findViewById(R.id.TextView03);
        
        //Colocamos la informaci�n
        user.setText(primera.getStringExtra("usuario"));
        passwd.setText(primera.getStringExtra("pass"));
        
        //Preparamos el boton de vuelta
        final Button boton=(Button) findViewById(R.id.button1);
        
        boton.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent devolucion = new Intent();
				//En el Intent enviamos la informaci�n de la primera ventana
				devolucion.putExtra("txt", "Comprobado OK");
				setResult(RESULT_OK,devolucion);
				finish();
			}
    
    	}
    
    );
		
		Log.i(TAG, "onCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
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
	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "onStart");
	}
	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "onResume");
	}
	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "onPause");
	}
	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "onStop");
	}
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "onRestart");
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "onDestroy");
	}
}
