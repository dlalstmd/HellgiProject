package com.example.test3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import userInformation.UserInformation;

public class RegisterPage extends AppCompatActivity implements UserInformation {
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);

        EditText userID;
        EditText userPW;

        userID = findViewById(R.id.UserEmailAddress);
        userPW = findViewById(R.id.UserPassword);

        Button register = (Button) findViewById(R.id.registerCompliteButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                UserInformation.setUserInformation(userID);
                startActivity(intent);
            }
        });
    }
}
