package com.example.test3;

import static java.lang.Class.forName;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import userInformation.UserInformation;

public class MainActivity extends AppCompatActivity {
    EditText idText;
    EditText pwText;

    String dbName = "minid0329";
    String tableName = "user";

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idText = (EditText) findViewById(R.id.idInput);
        pwText = (EditText) findViewById(R.id.pwInput);

        

        Button loginButton = (Button) findViewById(R.id.logInButton);

        Button register = (Button) findViewById(R.id.registerButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterPage.class);
                startActivity(intent);
            }
        });
    }
}