package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EmailEDT , PasswordEDT ;
    Button loginBTN , signupBTN ;
    public static String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EmailEDT = findViewById(R.id.EmailEDT);
        PasswordEDT = findViewById(R.id.PasswordEDT);
        loginBTN = findViewById(R.id.loginBTN);
        signupBTN = findViewById(R.id.signupBTN);
        signupBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this,Signin.class);
                    startActivity(intent);

            }

        });
        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(EmailEDT.getText().toString().equals("") ||PasswordEDT.getText().toString().equals("") )
                {
                    Toast.makeText(MainActivity.this,"Please fill all fields",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    name = EmailEDT.getText().toString();
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
                }
            }
        });

    }
}