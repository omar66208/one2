package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class homeactivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button1,button2;
    TextView TextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        button1 = findViewById(R.id.buttonplus);
        button2 = findViewById(R.id.buttonminus);
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        TextViewResult = findViewById(R.id.result);
    }

    public void plus(View view) {
        Double num1 = Double.parseDouble(editText1.getText().toString());
        Double num2 = Double.parseDouble(editText1.getText().toString());
        TextViewResult.setText((num1+num2)+" ");
    }

    public void minus(View view) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menufile1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.about_menu){
            Intent i = new Intent(this,aboutActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
   //     super.onBackPressed();



        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
       dialog.setTitle("back num");
        dialog.setMessage("dfji");
        dialog.setNegativeButton("no",null);
        dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
           @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               homeactivity.this.finish();
           }
        });
        dialog.setIcon(R.drawable.ic_baseline_accessible_24);
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

}

