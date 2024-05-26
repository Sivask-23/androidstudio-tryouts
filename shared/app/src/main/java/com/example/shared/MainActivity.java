package com.example.shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText un,pas;
    Button lo;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        String savedName=sp.getString("n",null);
        String savedPass=sp.getString("p",null);
        if (savedName!=null && savedPass!=null)
        {
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(i);
            finish();
        }
        else
        {
            setContentView(R.layout.activity_main);
            un=findViewById(R.id.user);
            pas=findViewById(R.id.pass);
            lo=findViewById(R.id.login);
            sp=getSharedPreferences("Mypref",MODE_PRIVATE);
            lo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SharedPreferences.Editor ed=sp.edit();
                    ed.putString("n",un.getText().toString());
                    ed.putString("p",pas.getText().toString());
                    ed.apply();
                    Intent i=new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                }
            });
        }

    }
}