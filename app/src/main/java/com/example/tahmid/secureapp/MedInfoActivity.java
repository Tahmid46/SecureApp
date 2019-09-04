package com.example.tahmid.secureapp;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MedInfoActivity extends AppCompatActivity {

    private Button searchButton;
    private AutoCompleteTextView searchText;
    private TextInputLayout med_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_info);

        searchButton=findViewById(R.id.button);
        searchText=findViewById(R.id.editText3);
        med_name=findViewById(R.id.medicine_name);

       try {
           DatabaseAccess meddata = DatabaseAccess.getInstance(getApplicationContext());

           meddata.open();

           ArrayList<String> medlist = new ArrayList<String>();
           medlist = meddata.getAllmed();
           String array[] = new String[medlist.size()];
           for (int j = 0; j < medlist.size(); j++) {
               array[j] = medlist.get(j);
           }
           ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);
           searchText.setAdapter(adapter);
       }catch (Exception e){
           Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
       }
    }
}
