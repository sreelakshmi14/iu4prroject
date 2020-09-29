package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import view.onClickListener;


public class MainActivity extends AppCompatActivity {
     EditText etUsername;
             Button btLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.user);
        btLogin = findViewById(R.id.lgbtn);

    }
}