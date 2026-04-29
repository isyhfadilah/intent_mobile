package com.example.latihan_intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnIntent;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnIntent = findViewById(R.id.btn_intent);
        btnIntent.setOnClickListener(v -> {
            intent = new Intent(MainActivity.this, IntentActivity.class);
            intent.putExtra("message", "Hello Intent");
            startActivity(intent);
        });


    }
}