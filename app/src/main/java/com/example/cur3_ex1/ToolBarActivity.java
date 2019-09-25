package com.example.cur3_ex1;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ToolBarActivity extends AppCompatActivity {
    Button showButton;
    Button hideButton;
    Button addButton;
    ProgressBar progressBar;
    Integer progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        showButton = findViewById(R.id.show_button);
        hideButton = findViewById(R.id.hide_button);
        addButton = findViewById(R.id.add_button);
        progressBar = findViewById(R.id.progressBar);
        progress = 0;

        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress = (progress >= 100) ? 0 : progress +20;
                progressBar.setProgress(progress);
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp(){
        Log.i("msg","Button pressed");

        return true;
    }
}
