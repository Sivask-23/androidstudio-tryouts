package com.example.loginpagecalcfactmultfib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText un,ps;
    Button log;
    TextView sh;
    ImageButton im;
    int count=3;
    boolean ok =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=findViewById(R.id.user);
        ps=findViewById(R.id.pass);
        sh=findViewById(R.id.res);
        im=findViewById(R.id.img);
        log=findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ok = check();
                if (ok)
                {
                    if (un.getText().toString().equals("siva") && ps.getText().toString().equals("sivakumar"))
                    {
                        Toast.makeText(MainActivity.this, "Redirecting..", Toast.LENGTH_SHORT).show();
                        Intent k = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(k);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Wrong Credentials", Toast.LENGTH_SHORT).show();
                        count--;
                        sh.setText("Attempt left:"+ count);
                        if (count==0)
                        {
                            log.setEnabled(false);
                        }
                    }
                }
                 else {
                    Toast.makeText(MainActivity.this,"enter username and password", Toast.LENGTH_SHORT).show();

                }
            }
        });
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(g);
            }
        });
    }

    public boolean check()
    {
        if (un.length()==0)
        {
            un.setError("username required");
            return false;
        }
        if (ps.length()==0) {
            ps.setError("password required");
            return false;
        }
        else if (ps.length()<8)
        {
            ps.setError("should be greater");
            return false;
        }
        else
        {
            return true;
        }
    }
}