package com.example.loginpagecalcfactmultfib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText e1,e2;
    Button ad,su,mu,di;

    TextView cal;

    ImageButton ne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        ad=findViewById(R.id.add);
        su=findViewById(R.id.sub);
        mu=findViewById(R.id.mul);
        di=findViewById(R.id.div);
        cal=findViewById(R.id.calcresult);
        ne=findViewById(R.id.nextfib);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(e1.getText().toString());
                int n2=Integer.parseInt(e2.getText().toString());
                int result=n1+n2;
                cal.setText(""+result);
            }
        });
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(e1.getText().toString());
                int n2=Integer.parseInt(e2.getText().toString());
                int result=n1-n2;
                cal.setText(""+result);
            }
        });
        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(e1.getText().toString());
                int n2=Integer.parseInt(e2.getText().toString());
                int result=n1*n2;
                cal.setText(""+result);
            }
        });
        di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(e1.getText().toString());
                int n2=Integer.parseInt(e2.getText().toString());
                int result=n1/n2;
                cal.setText(""+result);
            }
        });
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
            }
        });
    }
}