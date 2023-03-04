package com.example.mad_task_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText MainText;
    public static final String EXTRA_TEXT = "com.example.mad_task_04.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainText = findViewById(R.id.edit_text);
    }

    public void launchSecond(View view) {
        Intent intent = new Intent(this,second_activity.class);
        String message = MainText.getText().toString();
        intent.putExtra(EXTRA_TEXT, message);
        startActivity(intent);
    }
}