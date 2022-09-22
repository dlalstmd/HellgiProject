package com.example.test3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.database.*;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;


public class RegisterPage extends AppCompatActivity{

    EditText idText;
    EditText pwText;
    EditText nameText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);

        idText = (EditText) findViewById(R.id.UserEmailAddress);
        pwText = (EditText) findViewById(R.id.UserPassword);
        nameText = (EditText) findViewById(R.id.PersonName);

        Button register = (Button) findViewById(R.id.registerCompliteButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
