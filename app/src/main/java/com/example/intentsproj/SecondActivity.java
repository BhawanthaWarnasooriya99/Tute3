package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.editTextNumber3);
        num2 = findViewById(R.id.editTextNumber4);

        Bundle b = getIntent().getExtras();

        String n1, n2;

        n1 = b.getString("Number1");
        n2 = b.getString("Number2");

        num1.setText(n1);
        num2.setText(n2);
    }
}