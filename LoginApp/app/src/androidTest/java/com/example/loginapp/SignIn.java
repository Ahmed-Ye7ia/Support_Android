package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    EditText nameEDT , regEmailEDT , regPasswordEDT ;
    Button registerBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        nameEDT = findViewById(R.id.nameEDT);
        regEmailEDT = findViewById(R.id.regEmailEDT);
        regPasswordEDT = findViewById(R.id.regPasswordEDT);
        registerBTN = findViewById(R.id.registerBTN);
        if(regEmailEDT.getText().toString().equals("") ||regPasswordEDT.getText().toString().equals("") )
        {
            Toast.makeText(SignIn.this,"Please fill all fields",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent = new Intent(SignIn.this, Home.class);
            startActivity(intent);
        }
    }
}