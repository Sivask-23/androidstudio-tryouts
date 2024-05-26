package com.example.sharedprefer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    SharedPreferences sp;
    private static final String spName="mypref";
    private static final String keyName="n";
    private static final String keyEmail="e";

    TextView t1,t2;
    Button lg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.tn);
        t2=findViewById(R.id.te);
        lg=findViewById(R.id.lb);
        sp=getSharedPreferences(spName, MODE_PRIVATE);
        String n= sp.getString(keyName,null);
        String e= sp.getString(keyEmail,null);
        if (t1!=null || t2!=null)
        {
            t1.setText("Logged in as "+n);
            t2.setText(""+e);
            //startActivity(new Intent(this, MainActivity.class));
        }

    }
    public void logout(View view)
    {
        SharedPreferences.Editor ed=sp.edit();
        //ed.putString("Name","");
        //ed.putString("Email","");
        ed.clear();
        ed.apply();
        finish();
        //startActivity(new Intent(this, MainActivity.class));
    }
}