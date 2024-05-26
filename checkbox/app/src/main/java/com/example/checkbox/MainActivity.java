package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox pi,bu,co;
    Button ord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pi=findViewById(R.id.c1);
        bu=findViewById(R.id.c2);
        co=findViewById(R.id.c3);
        ord=findViewById(R.id.ob);
        ord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total=0;
                StringBuilder result= new StringBuilder();
                result.append("__Total Order__");
                if (pi.isChecked())
                {
                    result.append("\nPizza_100rs");
                    total+=100;
                }
                if (bu.isChecked())
                {
                    result.append("\nBurger_150rs");
                    total+=150;
                }
                if (co.isChecked())
                {
                    result.append("\nCola_50rs");
                    total+=50;
                }
                result.append("\nTotal_Amount"+total+"Rs");
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String s= result.toString();
                i.putExtra("Value",s);
                startActivity(i);
            }
        });
    }
}