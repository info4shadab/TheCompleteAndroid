package com.shadab.LayoutDemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("TAG", "onCreate() is called");

        Button switchActivity = findViewById(R.id.activitySwitcher);
        switchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(view.getContext(), buttonContainer.class);
                startActivity(switcher);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("TAG", "onStart() is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("TAG", "onResume() is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("TAG", "onRestart() is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("TAG", "onPause() is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("TAG", "onStop() is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("TAG", "onDestroy() is called");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_scrolling, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case (R.id.load):
                Toast.makeText(this, "Loading file...", Toast.LENGTH_LONG).show();
                break;

            case (R.id.save):
                Toast.makeText(this, "Saving file...", Toast.LENGTH_LONG).show();
                break;

            case (R.id.neww):
                Toast.makeText(this, "Creating new file...", Toast.LENGTH_LONG).show();
                break;

            case (R.id.action_settings):
                Toast.makeText(this, "This is settings", Toast.LENGTH_LONG).show();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}