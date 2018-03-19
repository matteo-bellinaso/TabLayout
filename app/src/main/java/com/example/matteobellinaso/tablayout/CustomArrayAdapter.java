package com.example.matteobellinaso.tablayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matteobellinaso.tablayout.Item.Item;
import com.example.matteobellinaso.tablayout.Item.ItemList;

import java.util.List;

/**
 * Created by matteobellinaso on 15/03/18.
 */

public class CustomArrayAdapter extends ArrayAdapter<Item> {

    private Context context;
    private List<Item> listone;



    public CustomArrayAdapter(Context context){
        super(context,  R.layout.item_layout, ItemList.getListItem());
        listone = ItemList.getListItem();
        this.context = context;
    }

    @Override
    public int getCount(){
        return this.listone.size();
    }

    public View getView(int position, View convertVire, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_layout, parent, false);

        TextView nameText = (TextView) rowView.findViewById(R.id.nome_item);
        String name = this.listone.get(position).getName();
        nameText.setText(name);

        ImageView image = (ImageView) rowView.findViewById(R.id.icon_item);
        image.setImageResource(this.listone.get(position).getImgUrl());

        return rowView;

    }
}
