package com.example.proyecto2_p6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private TextView tv4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        tv4 = findViewById(R.id.tv4);

        float res;
        String op;
        Intent intent = getIntent();
        res = intent.getFloatExtra("res", 0);
        op = intent.getStringExtra("op");

        tv4.setText(op + " = " + res);
    }
}
