package com.example.reversing3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText firstname, name, number, email;
    ConstraintLayout activity2;
    Button add_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = findViewById(R.id.firstName);
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        email = findViewById(R.id.email);
        add_btn = findViewById(R.id.add_btn);
        activity2 = findViewById(R.id.ResultLayout);
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstnames = firstname.getText().toString();
                String names = name.getText().toString();
                String numbers = number.getText().toString();
                String emails = email.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("firstname", firstnames);
                intent.putExtra("name", names);
                intent.putExtra("number", numbers);
                intent.putExtra("email", emails);
                startActivity(intent);
            }
        });
    }




}