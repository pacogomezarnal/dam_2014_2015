package com.example.listarlayout;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListarLayout extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	    String[] so = new String[] { "Android", "iPhone", "WindowsMobile",
	            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
	            "Linux", "OS/2" };
	        // use your custom layout
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	            R.layout.activity_listar_layout, R.id.label, so);
	        setListAdapter(adapter);
	}

	 @Override
	 protected void onListItemClick(ListView l, View v, int position, long id) {
	     String item = (String) getListAdapter().getItem(position);
	     Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	 }

}
