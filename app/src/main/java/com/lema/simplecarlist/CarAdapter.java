package com.lema.simplecarlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Krzysiek on 01.02.2018.
 */

class CarAdapter extends BaseAdapter{
    private Context mContext;
    private String[]names;
    private int[]photos;
    private LayoutInflater mInflater;

    public CarAdapter(Context context, String[] names, int[] photos) {
        mContext = context;
        this.names = names;
        this.photos = photos;
        mInflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=mInflater.inflate(R.layout.list,null);
        TextView name = (TextView)convertView.findViewById(R.id.textInList);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageInList);
        name.setText(names[position]);
        imageView.setImageResource(photos[position]);
        return convertView;
    }
}
