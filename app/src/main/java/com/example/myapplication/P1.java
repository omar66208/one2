package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class P1 extends AppCompatActivity {
    Button sub1;
     Button sub2;
     Button sub3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);
        sub1= findViewById(R.id.sub1);
        sub2 = findViewById(R.id.sub2);
        sub3 = findViewById(R.id.sub3);

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(P1.this,sub1.class);
                startActivity(a);
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(P1.this,sub2.class);
                startActivity(b);
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(P1.this,sub3.class);
                startActivity(c);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menufile1, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting_menu:
                Intent i = new Intent(this, setting.class);
                startActivity(i);
                break;

            case R.id.about_menu:
                Intent x = new Intent(this, aboutActivity.class);
                startActivity(x);
                break;

            case R.id.list_menu:
                Intent z = new Intent(this, list.class);
                startActivity(z);
                break;

            case R.id.logout_menu:
                Intent c = new Intent(this, MainActivity.class);
                startActivity(c);
                break;


        }

        return true;


    }
        public void sub1 (View view){
            Intent k = new Intent(this,sub1.class);
            startActivity(k);
    }

}