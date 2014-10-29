package com.example.listarlayoutpropio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MiAdaptador extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	
	//Constructor de nuestro manehjador de datos
	public MiAdaptador(Context context, int resource, int textViewResourceId,
			String[] objects) {
		super(context, resource, textViewResourceId, objects);
	    this.context = context;
	    this.values = objects;
	}
	
	//Este método lo llama ListView cada vez que quiere pintar un dato
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView;
		if(convertView==null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			rowView = inflater.inflate(R.layout.activity_main, parent, false);
		}else{
			rowView=convertView;
		}
		
	    TextView textView = (TextView) rowView.findViewById(R.id.label);
	    ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
	    textView.setText(values[position]);
	    // Change the icon for Windows and iPhone
	    String s = values[position];
	    if (s.startsWith("Windows")) {
	      imageView.setImageResource(R.drawable.icow);
	    } else if(s.startsWith("iPh")||s.startsWith("Ma"))  {
	      imageView.setImageResource(R.drawable.icoa);
	    }else{
	    	imageView.setImageResource(R.drawable.ic_launcher);
	    }
	    return rowView;
	  }
}
