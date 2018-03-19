package com.example.matteobellinaso.tablayout.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import com.example.matteobellinaso.tablayout.R;

/**
 * Created by matteobellinaso on 07/03/18.
 */

public class Fragment1 extends Fragment {


    public Fragment1(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment1, container, false);
        return view;
    }



}
