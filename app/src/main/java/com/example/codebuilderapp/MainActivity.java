package com.example.codebuilderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int currentLevel = 0;

    private TextView currentLevelText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button levelUpButton = findViewById(R.id.main_current_level_text);
        currentLevelText = findViewById(R.id.main_level_up_button);

        updateCurrentLevel();

        levelUpButton.setOnClickListener(v -> {
            currentLevel += 1;
            updateCurrentLevel();
        });
    }

    private void updateCurrentLevel() {
        currentLevelText.setText(String.valueOf(currentLevel));
    }
}