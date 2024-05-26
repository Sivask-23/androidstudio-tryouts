package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    Button fi;
    TextView re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=findViewById(R.id.r);
        fi=findViewById(R.id.f);
        re=findViewById(R.id.res);
        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rbid=rg.getCheckedRadioButtonId();
                if (rbid==-1)
                {
                    Toast.makeText(MainActivity.this, "Select one..", Toast.LENGTH_SHORT).show();
                }
                else {
                    rb=findViewById(rbid);
                    String stat=rb.getText().toString();
                    switch (stat) {
                        case "Kerala":
                            re.setText("Trivandrum");
                            break;
                        case "Tamilnadu":
                            re.setText("Chennai");
                            break;
                        case "India":
                            re.setText("Delhi");
                            break;
                        default:
                            re.setText("Select one");
                    }
                }

                rg.clearCheck();


            }
        });

    }
}