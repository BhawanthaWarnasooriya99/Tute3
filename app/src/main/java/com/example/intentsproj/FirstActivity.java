package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button b;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        b = findViewById(R.id.button);

        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
    }


    public void btnclick(View view) {

        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
        finish();

        Toast.makeText(FirstActivity.this,"Sending message...",Toast.LENGTH_SHORT).show();

        String n1;
        String n2;
        n1 = num1.getText().toString();
        n2 = num2.getText().toString();

        //Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("Number1", n1);
        i.putExtra("Number2", n2);
        startActivity(i);
    }
}