package com.example.saket.stackviewsamp;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StackAdapter extends ArrayAdapter<StackItems> {

    private ArrayList<StackItems> items;
    private Context ctx;

    public StackAdapter(Context context, int textViewResourceId,
                        ArrayList<StackItems> objects) {
        super(context, textViewResourceId, objects);

        this.items = objects;
        this.ctx = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)
                    ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.item, null);
        }

        StackItems m = items.get(position);

        if (m != null) {
            TextView text = (TextView) v.findViewById(R.id.textView1);
            ImageView img = (ImageView)v.findViewById(R.id.imageView1);

            if (text != null) {
                text.setText(m.text);
                img.setImageDrawable(m.img);
            }
        }
        return v;
    }
}