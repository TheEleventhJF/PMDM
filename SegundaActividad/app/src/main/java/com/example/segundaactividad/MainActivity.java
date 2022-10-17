package com.example.segundaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lSalida;
    Button bContador;
    Button bRestart;
    Button bDoblar;
    int cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lSalida = findViewById(R.id.lSalida);
        bContador = findViewById(R.id.bContador);
        bRestart =  findViewById(R.id.bRestart);
        bDoblar = findViewById(R.id.bDoblar);

        bContador.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cont++;
                        lSalida.setText(String.valueOf(cont));
                    }
                }
        );

        bRestart.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        lSalida.setText("0");
                        cont=0;
                    }
                }
        );

        bDoblar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cont*=2;
                        lSalida.setText(String.valueOf(cont));
                    }
                }
        );
    }



}