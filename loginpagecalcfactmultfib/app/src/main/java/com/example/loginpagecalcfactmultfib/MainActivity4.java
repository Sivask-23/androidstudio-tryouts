package com.example.loginpagecalcfactmultfib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    EditText mn,mr;
    Button mg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mn=findViewById(R.id.mnum);
        mr=findViewById(R.id.mrange);
        mg=findViewById(R.id.mbut);
        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=mn.getText().toString();
                String range=mr.getText().toString();
                Intent h = new Intent(getApplicationContext(), MainActivity5.class);
                h.putExtra("num",num);
                h.putExtra("range",range);
                startActivity(h);
            }
        });
    }
}