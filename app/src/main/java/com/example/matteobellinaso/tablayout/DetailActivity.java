package com.example.matteobellinaso.tablayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matteobellinaso.tablayout.Fragment.Fragment2;
import com.example.matteobellinaso.tablayout.Item.ItemList;

/**
 * Created by matteobellinaso on 15/03/18.
 */

public class DetailActivity extends Activity {

    private int currentItem;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        final int selectedItem = intent.getIntExtra(Fragment2.EXTRA_SELECTED_ITEM , 0);

        currentItem = selectedItem;

        TextView detailNome = (TextView) findViewById(R.id.detail_name);
        detailNome.setText(ItemList.getListItem().get(currentItem).getName());

        ImageView imageView = (ImageView) findViewById(R.id.detail_img);
        imageView.setImageResource(ItemList.getListItem().get(currentItem).getImgUrl());

        TextView detailText = (TextView) findViewById(R.id.detail_text);
        detailText.setText(ItemList.getListItem().get(currentItem).getDescription());

    }
}
