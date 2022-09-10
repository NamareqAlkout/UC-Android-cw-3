package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String age = bundle.getString("age");


        TextView textname = findViewById(R.id.textViewname2);
        TextView textage = findViewById(R.id.textViewage2);

        textname.setText(name);
        textname.setText(age);

        textname.setText(name);
        textage.setText(age);

    }
}