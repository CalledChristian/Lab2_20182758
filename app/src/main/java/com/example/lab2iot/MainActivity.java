package com.example.lab2iot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        /*Button button = findViewById(R.id.button1);
        button.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this,IndicacionesActivity.class)));*/
    }

    public void irIndicacionesActivity(View view) {
        //primero crear el intento
        Intent intent = new Intent(this, IndicacionesActivity.class);
        //iniciar activity
        startActivity(intent);
    }

    public void irCalculadoraActivity(View view) {

        //primero crear el intento
        Intent intent = new Intent(this, CalculadoraActivity.class);
        //iniciar activity
        startActivity(intent);
    }
}