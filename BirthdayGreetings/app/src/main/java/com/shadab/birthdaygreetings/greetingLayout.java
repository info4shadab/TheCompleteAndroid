package com.shadab.birthdaygreetings;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class greetingLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting_layout);

        TextView nameDisplay = findViewById(R.id.name);
        Bundle extra = getIntent().getExtras();

        if (extra != null) {
            nameDisplay.setText(extra.getString("userName"));
        }

    }
}