package com.example.loginpagecalcfactmultfib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView muresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        muresult=findViewById(R.id.mres);
        Bundle b = getIntent().getExtras();
        int n = Integer.parseInt(b.getString("num"));
        int r = Integer.parseInt(b.getString("range"));
        for (int i =1;i<=r;i++)
        {
            muresult.append(i+"*"+n+"="+(i*n)+"\n");
        }
    }
}