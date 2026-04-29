package com.example.latihan_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntentActivity extends AppCompatActivity {

    Intent intent;
    Button btnYoutube;
    Button btnLinkedin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intent);

        String message = getIntent().getStringExtra("message");

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        btnYoutube = findViewById(R.id.btn_youtube);
        btnYoutube.setOnClickListener(v -> {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@rudysof"));
            startActivity(intent);
        });

        btnLinkedin = findViewById(R.id.btn_linkedin);

    }
}