package com.example.lab2iot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IndicacionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_indicaciones);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void irCalculadoraActivity(View view) {

        //primero crear el intento
        Intent intent = new Intent(this, CalculadoraActivity.class);
        //iniciar activity
        startActivity(intent);
    }
}