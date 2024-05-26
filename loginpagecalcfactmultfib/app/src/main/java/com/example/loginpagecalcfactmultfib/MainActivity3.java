package com.example.loginpagecalcfactmultfib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText num1;
    TextView r;
    Button gen;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        num1=findViewById(R.id.fnum);
        gen=findViewById(R.id.fbut);
        next=findViewById(R.id.next);
        r=findViewById(R.id.fres);
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(num1.getText().toString());
                int res=1;
                for (int i=1;i<n;i++)
                {
                    res=res*i;
                }
                r.setText("Factorial:"+res);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(l);
            }
        });
    }
}