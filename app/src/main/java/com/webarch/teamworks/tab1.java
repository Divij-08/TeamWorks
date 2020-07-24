package com.webarch.teamworks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.

 */
public class tab1 extends Fragment {
    public TextView phone,phonelabel,email , emaillabel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        phone = view.findViewById(R.id.phone);
        email = view.findViewById(R.id.mail);
        phonelabel=view.findViewById(R.id.label1);
        emaillabel=view.findViewById(R.id.label2);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Phone = phone.getText().toString();
                String s = "tel:" + Phone ;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(s));
                startActivity(intent);

            }
        });
        return view;
    }
}