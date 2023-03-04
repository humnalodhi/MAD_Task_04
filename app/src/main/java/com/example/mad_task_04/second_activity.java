package com.example.mad_task_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
    //TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent =getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        TextView textView = findViewById(R.id.text_header);
        textView.setText(message);
    }
}