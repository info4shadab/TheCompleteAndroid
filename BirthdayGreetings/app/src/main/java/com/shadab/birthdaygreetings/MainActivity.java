package com.shadab.birthdaygreetings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button greeter = findViewById(R.id.button24);
        EditText nameInput = findViewById(R.id.editText);

        greeter.setOnClickListener(view -> {
            String name = nameInput.getText().toString();
//            Toast.makeText(getApplicationContext(), "" + name, Toast.LENGTH_LONG).show();
            Intent generateGreeter = new Intent(view.getContext(), greetingLayout.class);
            generateGreeter.putExtra("userName", name);
            startActivity(generateGreeter);
        });
    }
}