package com.example.reversing3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView TextView_get,TextView_get2,TextView_get3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView_get = findViewById(R.id.textView2);
        TextView_get2 = findViewById(R.id.textView3);
        TextView_get3 = findViewById(R.id.textView4);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String firstname = bundle.getString("firstname");
        String name = bundle.getString("name");
        String number = bundle.getString("number");
        String email = bundle.getString("email");
        TextView_get.setText("Name:" + firstname + name);
        TextView_get2.setText("Phone:" + number);
        TextView_get3.setText("Email:" + email);
    }
}