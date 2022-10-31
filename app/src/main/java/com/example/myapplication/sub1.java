package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub1 extends AppCompatActivity {
    private Button Cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
        Cancel = findViewById(R.id.cancel1);
    }
    public void cancel(View view) {
        Intent a = new Intent(this, P1.class);
        startActivity(a);
    }
}