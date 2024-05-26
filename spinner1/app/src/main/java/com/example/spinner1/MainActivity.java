package com.example.spinner1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String [] Courses={"C","DS","OS","OOPS","C#"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp=findViewById(R.id.spin);
        sp.setOnItemSelectedListener(this);
        ArrayAdapter ad = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,Courses);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ad);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(getApplicationContext(),Courses[position], Toast.LENGTH_SHORT).show();
        

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}