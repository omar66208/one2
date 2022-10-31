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
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etMail, etPassword, editText1, editText2;
    private Button buttonLogin, buttonSignup, button1, button2;

    //private final String valid_mail = "admin";
   // private final String valid_password = "1";
    SharedPreferences preferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        etMail = findViewById(R.id.Name);
        etPassword = findViewById(R.id.editTextTextPassword3);

        buttonLogin = findViewById(R.id.Button);
        buttonSignup = findViewById(R.id.register);

           preferences = getSharedPreferences("user_info",0);
    }

    public void login(View view) {

        String input_mail = etMail.getText().toString();
        String input_password = etPassword.getText().toString();

        String register1 = preferences.getString("email","");
        String register2 = preferences.getString("password","");

        if (input_mail.equals(register1) && input_password.equals(register2)){
            Intent i_mail = new Intent(this,P1.class);
        startActivity(i_mail);
}else{
    Toast.makeText(this,"wrong info",Toast.LENGTH_SHORT).show();

}

    }
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menufile1, menu);
        return true;
    }
    public void register(View view){
        Intent i_register = new Intent(this,register.class);
        startActivity(i_register);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting_menu:
                Intent a = new Intent(this, setting.class);
                startActivity(a);
                break;
            case R.id.about_menu:
                Intent b = new Intent(this, aboutActivity.class);
                startActivity(b);
                break;

            case R.id.list_menu:
                Intent c = new Intent(this, list.class);
                startActivity(c);
                break;

            case R.id.logout_menu:
                Intent n = new Intent(this,MainActivity.class);
                startActivity(n);
                break;



        }
        return true;


        }


    }

