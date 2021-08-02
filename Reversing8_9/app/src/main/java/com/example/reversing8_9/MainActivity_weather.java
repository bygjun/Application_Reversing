package com.example.reversing8_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executors;

public class MainActivity_weather extends AppCompatActivity {

    TextView tv;
    ArrayList<String> items = new ArrayList<String>();
    String weather_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_weather);

        tv = findViewById(R.id.textView);
        final apiTest at = new apiTest();
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                try {
                    items = at.func();
                    System.out.println(items);
                    tv.setText("1시간 기온:"+items.get(0) +
                            "\n풍속:"+items.get(4)+
                            "\n풍향:"+items.get(3)+
                            "\n하늘상태:"+ items.get(5)
                            );
                } catch (IOException | JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
