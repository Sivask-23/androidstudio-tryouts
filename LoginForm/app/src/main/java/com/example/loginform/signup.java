package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.regex.Pattern;

public class signup extends AppCompatActivity {
    EditText fn,ln,em;
    Button bc,cn;
    CheckBox ch1,ch2,ch3;

    RadioGroup rg;
    RadioButton rb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        fn=findViewById(R.id.fname);
        ln=findViewById(R.id.lname);
        em=findViewById(R.id.em);
        bc=findViewById(R.id.bback);
        ch1=findViewById(R.id.c1);
        ch2=findViewById(R.id.c2);
        ch3=findViewById(R.id.c3);
        cn=findViewById(R.id.bconfirm);
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkup()&&evalidator())
                {
                    StringBuilder result=new StringBuilder();
                    result.append("_______Details_______\n");
                    result.append("Name:"+fn.getText().toString()+" "+ln.getText().toString()+"\n");
                    rg=findViewById(R.id.rag);
                    int rid=rg.getCheckedRadioButtonId();
                    rb=findViewById(rid);
                    String sex=rb.getText().toString();
                    result.append("SEX: "+sex+"\n");
                    result.append("Email:"+em.getText().toString()+"\n");
                    result.append("Qualifications:");
                    if (ch1.isChecked())
                    {
                        result.append(" PG");
                    }
                    if (ch2.isChecked())
                    {
                        result.append(", UG");
                    }
                    if (ch3.isChecked())
                    {
                        result.append(", Diploma");
                    }
                    result.append("\n");

                    Intent k =new Intent(getApplicationContext(),finalpage.class);
                    String st=result.toString();
                    k.putExtra("Values",st);
                    startActivity(k);
                }
            }
        });
    }


    public boolean checkup()
    {
        if (fn.length()==0&fn.length()<5)
        {
            fn.setError("Required");
            return false;
        }
        if (ln.length()==0&ln.length()<5)
        {
            ln.setError("Required");
            return false;
        }
        else
        {
            return true;
        }
    }


    public boolean evalidator()
    {
        String str=em.getText().toString();
        if (!str.isEmpty()&& Patterns.EMAIL_ADDRESS.matcher(str).matches())
        {
            return true;
        }
        else
        {
            em.setError("Required");
            return false;
        }
    }
}