package com.example.paynavtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    Button btn_dashboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn_dashboard = findViewById(R.id.btn_dashboard);
        btn_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, MainActivity.class));
            }
        });

    }
}