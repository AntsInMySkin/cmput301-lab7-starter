package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        // Find button IDs
        TextView cityNameText = findViewById(R.id.text_cityName);
        Button backButton = findViewById(R.id.button_back);

        // Get the city name
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("CITY_NAME");
        cityNameText.setText(cityName);

        // Back button returns to MainActivity
        backButton.setOnClickListener(v -> finish());
    }
}

