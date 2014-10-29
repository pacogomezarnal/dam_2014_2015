package com.example.listarlayoutpropio;


import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	    String[] so = new String[] { "Android", "iPhone", "WindowsMobile",
	            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
	            "Linux", "OS/2","Android", "iPhone", "WindowsMobile",
	            "Blackberry", "WebOS", };
	        // use your custom layout
	    	MiAdaptador adapter = new MiAdaptador(this,
		            R.layout.activity_main, R.id.label, so);
	    	setListAdapter(adapter);
	}

	 @Override
	 protected void onListItemClick(ListView l, View v, int position, long id) {
	     String item = (String) getListAdapter().getItem(position);
	     Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	 }
}
