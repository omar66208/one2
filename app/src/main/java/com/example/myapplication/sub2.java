package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub2 extends AppCompatActivity {
    private Button Cancel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        Cancel2 = findViewById(R.id.cancel2);
    }
    public void cancel2 (View view) {
        Intent v = new Intent(this, P1.class);
        startActivity(v);
    }
}