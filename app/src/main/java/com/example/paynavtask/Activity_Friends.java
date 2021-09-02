package com.example.paynavtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_Friends extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String name = getIntent().getStringExtra("name");
        tv = findViewById(R.id.tv_name_friends);
        tv.setText(name);
    }
}