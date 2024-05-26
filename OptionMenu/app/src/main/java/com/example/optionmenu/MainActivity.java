package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.act1) {
            Toast.makeText(this, "Act 1", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(MainActivity.this,Activity1.class);
            startActivity(i);
            return true;
        } else if (itemId == R.id.act2) {
            Toast.makeText(this, "Act 2", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(MainActivity.this,Activity2.class);
            startActivity(i);
            return true;
        }else if (itemId == R.id.act3) {
            Toast.makeText(this, "Act 3", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(MainActivity.this,Activity3.class);
            startActivity(i);
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }
}