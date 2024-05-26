package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText ed1;
    Button b1,go;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed1=findViewById(R.id.factnum);
        b1=findViewById(R.id.check);
        go=findViewById(R.id.gotologin);
        res=findViewById(R.id.factres);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s =ed1.getText().toString();
                int n1=Integer.parseInt(s);
                int reslt=1;
                for (int i=1;i<=n1;i++)
                {
                    reslt=reslt*i;
                }
                res.append(Integer.toString(reslt));
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(j);
            }
        });
    }
}