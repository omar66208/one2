package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub3 extends AppCompatActivity {
    private Button Cancel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);
        Cancel3 = findViewById(R.id.cancel3);
    }
    public void cancel3 (View view) {
        Intent c = new Intent(this, P1.class);
        startActivity(c);
    }
}