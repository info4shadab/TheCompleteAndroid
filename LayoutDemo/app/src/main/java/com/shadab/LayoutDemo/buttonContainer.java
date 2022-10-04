package com.shadab.LayoutDemo;
import com.shadab.LayoutDemo.layouts.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;


public class buttonContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_container);

        Button button1 = findViewById(R.id.button17);
        Button button2 = findViewById(R.id.button18);
        Button button3 = findViewById(R.id.button19);
        Button button4 = findViewById(R.id.button20);
        Button button5 = findViewById(R.id.button21);
        Button button6 = findViewById(R.id.button22);
        Button wayToGoogle = findViewById(R.id.wayToGoogle);

        button1.setOnClickListener(view -> {
            Intent constraintL = new Intent(view.getContext(), constraintLayout.class);
            startActivity(constraintL);
        });

        button2.setOnClickListener(view -> {
            Intent constraintL2 = new Intent(view.getContext(), constraintLayout2.class);
            startActivity(constraintL2);
        });

        button3.setOnClickListener(view -> {
            Intent grid = new Intent(view.getContext(), gridLayout.class);
            startActivity(grid);
        });

        button4.setOnClickListener(view -> {
            Intent linearV = new Intent(view.getContext(), linearActivityVertical.class);
            startActivity(linearV);
        });

        button5.setOnClickListener(view -> {
            Intent LinearH = new Intent(view.getContext(), linearLayoutHorizontal.class);
            startActivity(LinearH);
        });

        button6.setOnClickListener(view -> {
            Intent relativeL = new Intent(view.getContext(), relativeLayout.class);
            startActivity(relativeL);
        });

        wayToGoogle.setOnClickListener(view -> {
            Intent gotoGoogle = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com/"));
            startActivity(gotoGoogle);

        });

    }
}