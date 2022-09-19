package com.example.test3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import userInformation.UserInformation;

public class RegisterPage extends AppCompatActivity{

    EditText idText;
    EditText pwText;
    EditText nameText;

    String dbName = "minid0329";
    String tableName = "user";

    SQLiteDatabase db;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);

        idText = (EditText) findViewById(R.id.UserEmailAddress);
        pwText = (EditText) findViewById(R.id.UserPassword);
        nameText = (EditText) findViewById(R.id.PersonName);

        db= this.openOrCreateDatabase(dbName, MODE_PRIVATE, null); //db문서를 열거나, 없으면 만드는 작업

        //만들어진 DB파일에 "member"라는 이름으로 테이블 생성 작업 수행
        db.execSQL("CREATE TABLE IF NOT EXISTS "+tableName+"(num integer primary key autoincrement, email text not null, password text not null, name text not null);");
        //괄호 안에 SQL언어 쓰면 됨.
        //IF NOT EXISTS <- 만약 존재하지 않으면 만들자.

        Button register = (Button) findViewById(R.id.registerCompliteButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = idText.getText().toString();
                String password = pwText.getText().toString();
                String name = nameText.getText().toString();

                db.execSQL("INSERT INTO "+tableName+"(email, password, name) VALUES('"+email+"','"+password+"','"+name+"');");

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
