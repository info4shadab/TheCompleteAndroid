package com.shadab.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputText = findViewById(R.id.inputBox);
        Button converterButton = findViewById(R.id.convertButton);
        EditText outputText = findViewById(R.id.outputBox);

        double convertFactor = 2.20462d;
        converterButton.setOnClickListener(view -> {
            double weight = Double.parseDouble(inputText.getText().toString());
            double weightInLBS = weight * convertFactor;
            String formatOutput = weightInLBS + " lbs";
            Log.v("inputDouble", "You have entered: " + weight);
            Log.v("outputDouble", "Your output: " + weightInLBS);
            outputText.setText(formatOutput);
//            Toast.makeText(getApplicationContext(), "" + weightInLBS, Toast.LENGTH_LONG).show();
        });
    }
}