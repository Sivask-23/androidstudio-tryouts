package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText user,pass;
    Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        user=findViewById(R.id.un);
        pass=findViewById(R.id.pw);
        log=findViewById(R.id.login);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("siva")&&pass.getText().toString().equals("siva123"))
                {
                    Intent k = new Intent(MainActivity3.this, MainActivity4.class);
                    startActivity(k);
                }
                else {
                    Toast.makeText(MainActivity3.this,"Wrong credentials!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}