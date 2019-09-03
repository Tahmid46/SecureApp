package com.example.tahmid.secureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    private Button searchBtn,myMedBtn,MedNotiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        searchBtn=findViewById(R.id.searchId);
        myMedBtn=findViewById(R.id.MedId);
        MedNotiBtn=findViewById(R.id.notiId);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MedInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
