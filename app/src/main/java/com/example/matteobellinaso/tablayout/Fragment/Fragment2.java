package com.example.matteobellinaso.tablayout.Fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.matteobellinaso.tablayout.CustomArrayAdapter;
import com.example.matteobellinaso.tablayout.DetailActivity;
import com.example.matteobellinaso.tablayout.R;


/**
 * Created by matteobellinaso on 07/03/18.
 */

public class Fragment2 extends Fragment {

    CustomArrayAdapter adapter;

    public final static String EXTRA_SELECTED_ITEM = "com.example.matteobellinaso.SELCTED_ITEM";

    public Fragment2() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){

        adapter = new CustomArrayAdapter(getContext());

        View rootview =  inflater.inflate(R.layout.fragment2, parent, false);
       ListView listView = rootview.findViewById(R.id.listView);
       listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Intent intent = new Intent(getContext(), DetailActivity.class);
               intent.putExtra(EXTRA_SELECTED_ITEM, position );
               startActivity(intent);
           }
       });

       return rootview;
    }


}
