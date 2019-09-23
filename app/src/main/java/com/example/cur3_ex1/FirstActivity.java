package com.example.cur3_ex1;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    Button sendButton;
    EditText text_1;
    EditText text_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        sendButton = findViewById(R.id.yes_butt);
        final EditText text_1 = findViewById(R.id.editText1);;
        final EditText text_2 = findViewById(R.id.editText2);;

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "You say: " + text_1.getText() + " " + text_2.getText(), Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }
}
