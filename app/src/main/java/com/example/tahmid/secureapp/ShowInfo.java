package com.example.tahmid.secureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowInfo extends AppCompatActivity {

    private TextView textView1,textView2,textView3,textView4,textView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        textView1=findViewById(R.id.brand);
        textView2=findViewById(R.id.generic);
        textView3=findViewById(R.id.indication);
        textView4=findViewById(R.id.dose);
        textView5=findViewById(R.id.sideEffects);

        Intent i=getIntent();
        ArrayList<String> s=i.getStringArrayListExtra("details");


        textView1.setText(s.get(0));
        textView2.setText(s.get(1));
        textView3.setText(s.get(2));
        textView4.setText(s.get(3));
        textView5.setText(s.get(4));


    }
}
