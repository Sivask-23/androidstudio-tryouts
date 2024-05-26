package com.example.sharedprefer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sp;
    private static final String spName="mypref";
    private static final String keyName="n";
    private static final String keyEmail="e";
    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.na);
        e2=findViewById(R.id.em);
        b1=findViewById(R.id.sb);
    }

    public void login(View view)
    {
        sp=getSharedPreferences(spName,MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putString(keyName,e1.getText().toString());
        ed.putString(keyEmail,e2.getText().toString());
        ed.apply();
        startActivity(new Intent(this, MainActivity2.class));
    }
}