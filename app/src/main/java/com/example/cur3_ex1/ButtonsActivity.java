package com.example.cur3_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


//flat button в виде текста, flat button с границей, raised button, raised button с фоном, float action button
public class ButtonsActivity extends AppCompatActivity {
    Button flatButtonText;
    Button flatButtonBorder;
    Button raisedButton;
    Button raisedButtonBackground;
    Button floatActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
    }
}
