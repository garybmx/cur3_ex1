package com.example.cur3_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                                           MainActivity.this.startActivity(intent);
                                       }
                                   }
        );

        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                           MainActivity.this.startActivity(intent);
                                       }
                                   }
        );
        button3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                                           MainActivity.this.startActivity(intent);
                                       }
                                   }
        );

    }
}
