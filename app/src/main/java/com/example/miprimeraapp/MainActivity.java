package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtEscribeTuNombre;
    private Button btnIniciarSesion;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEscribeTuNombre = findViewById(R.id.txtEscribeTuNombre);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        textView = findViewById(R.id.textView);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.format("Bienvenido:%s", txtEscribeTuNombre.getText().toString()));
            }
        });


    }
}