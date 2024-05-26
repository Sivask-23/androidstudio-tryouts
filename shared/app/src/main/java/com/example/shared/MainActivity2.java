package com.example.shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView n1,p1;
    Button lg;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        n1=findViewById(R.id.u);
        p1=findViewById(R.id.p);
        lg=findViewById(R.id.logout);
        sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        String n= sp.getString("n",null);
        String p=sp.getString("p",null);
        n1.setText(""+n);
        p1.setText(""+p);

        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor ed= sp.edit();
                ed.clear();
                ed.apply();
                Intent j = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(j);
                finish();
            }
        });
    }
}