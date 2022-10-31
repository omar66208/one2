package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    private EditText etMail, etPassword;
    private Button Cancel,buttonRegister ;
    SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etMail = findViewById(R.id.editTextTextEmailAddress2);
        etPassword = findViewById(R.id.editTextTextPassword);

        Cancel = findViewById(R.id.buttonCancel);
        buttonRegister = findViewById(R.id.buttonRegister);

        preferences = getSharedPreferences("user_info",0);

    }
    public void register(View view){
        String input_mail = etMail.getText().toString();
        String input_password = etPassword.getText().toString();

             if (input_mail.length()>0) {
            SharedPreferences.Editor editor = preferences.edit();

            editor.putString("email", input_mail);
            editor.putString("password", input_password);

            editor.apply();
            Toast.makeText(this, "user registered!", Toast.LENGTH_LONG).show();
            Intent intent_main = new Intent(this, MainActivity.class);
            startActivity(intent_main);
             }else {
            Toast.makeText(this, "not vaild,please insert", Toast.LENGTH_SHORT).show();
        }
        }
        public void cancel(View view){
        Intent intent_main = new Intent(this,MainActivity.class);
        startActivity(intent_main);
    }
    @Override
    public void onBackPressed() {
        //     super.onBackPressed();


        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("back num");
        dialog.setMessage("dfji");
        dialog.setNegativeButton("no", null);
        dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                register.this.finish();
            }
        });
        dialog.setIcon(R.drawable.ic_baseline_accessible_24);
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}