package com.example.matteobellinaso.tablayout.Fragment;


import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SyncStatusObserver;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.matteobellinaso.tablayout.MainActivity;
import com.example.matteobellinaso.tablayout.R;

/**
 * Created by matteobellinaso on 07/03/18.
 */

public class Fragment3 extends Fragment{
    private  String toastMsg = "email sended";


    public Fragment3(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment3, parent, false);
    }


    @Override
    public void onViewCreated(View view, Bundle saveIstanceState){

         final EditText adress = (EditText) view.findViewById(R.id.edit_send);
         final EditText subject = (EditText) view.findViewById(R.id.edit_sub);
         final EditText message = (EditText) view.findViewById(R.id.edit_message);

        Button btnSend = (Button) view.findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(adress.getText() != null ||  subject.getText() != null || message.getText() != null ) {
                    System.out.println("siblocca");

                    String mailto = "mailto:" + adress.getText() + "?subject=" + Uri.encode(subject.getText().toString()) + "&body=" + Uri.encode(message.getText().toString());

                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                    emailIntent.setData(Uri.parse(mailto));
                    try{
                        startActivity(emailIntent);
                    }catch (ActivityNotFoundException e){

                    }
                }

                toast();
            }
        });
    }

    public void toast(){
        Toast.makeText(getContext() ,toastMsg, Toast.LENGTH_LONG ).show();
    }
}

