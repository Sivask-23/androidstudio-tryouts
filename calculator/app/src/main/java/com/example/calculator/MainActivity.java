package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText _num1,_num2;
    Button _add, _fact;
    TextView _res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _num1=findViewById(R.id.num1);
        _num2=findViewById(R.id.num2);
        _add=findViewById(R.id.btn);
        _res=findViewById(R.id.res);
        _fact =findViewById(R.id.btn2);
        _add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a =_num1.getText().toString();
                String b =_num2.getText().toString();
                int a1 = Integer.parseInt(a);
                int b2 = Integer.parseInt(b);
                int result=a1+b2;
                _res.setText("Result:" + (result));

            }
        });
        _fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });


    }
}