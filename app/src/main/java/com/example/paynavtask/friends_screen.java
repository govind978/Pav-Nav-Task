package com.example.paynavtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class friends_screen extends AppCompatActivity {

    Button btn_trans,btn_msg;
    TextView tv;
    RelativeLayout iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_screen);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String name = getIntent().getStringExtra("name");
        tv = findViewById(R.id.tv_name);
        tv.setText(name);

        btn_msg = findViewById(R.id.btn_message);
        btn_trans = findViewById(R.id.btn_transaction);
        btn_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(friends_screen.this, TransactionActivity.class));
            }
        });
        btn_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(friends_screen.this, MessageActivity.class));
            }
        });

        mybottomsheetFregment_friends fragment = new mybottomsheetFregment_friends();
        iv = findViewById(R.id.layout_showBottomsheet);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment.show(getSupportFragmentManager(), "TAG");
            }
        });

    }
}