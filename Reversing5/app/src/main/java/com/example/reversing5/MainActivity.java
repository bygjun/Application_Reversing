package com.example.reversing5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] languages = { "C", "C++", "Java", "C#", "PHP", "JavaScript",
            "jQuery", "AJAX", "JSON" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> wordList = new ArrayList<String>();
        Collections.addAll(wordList, languages);
        AutoCompleteAdapter adapter = new AutoCompleteAdapter(this,
                android.R.layout.simple_dropdown_item_1line,
                android.R.id.text1,wordList);
        AutoCompleteTextView acTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        acTextView.setThreshold(1);
        acTextView.setAdapter(adapter);


        Button button1 = (Button) findViewById(R.id.newActivity);
        Button button2 = (Button) findViewById(R.id.newActivity2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScrollingActivity.class);
                startActivity(intent);
            }
        });
    }


}
