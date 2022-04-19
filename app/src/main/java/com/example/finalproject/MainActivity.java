package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textEmail, textPassword;
//        try {
//            //Create sign in database
//            SQLiteDatabase myDB = this.openOrCreateDatabase("WTDb", MODE_PRIVATE, null);
//
//            //User Table
//            myDB.execSQL("CREATE TABLE IF NOT EXISTS Users (user PLAINTEXT, password TEXT)");
//            //Add user
//            myDB.execSQL("INSERT INTO Users (user, password) VALUES ('alice@wtamu.edu', 'password123')");
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
        textEmail = findViewById(R.id.textEmail);
        textPassword = findViewById(R.id.textPassword);

    }


}