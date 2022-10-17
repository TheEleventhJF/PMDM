package com.example.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Contador;
    Button Reset, Mas, Menos;
    int cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contador = findViewById(R.id.Contador);
        Reset = findViewById(R.id.Reset);
        Mas = findViewById(R.id.Mas);
        Menos = findViewById(R.id.Menos);

        Reset.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cont=0;
                        Contador.setText(String.valueOf(cont));
                    }
                }

        );

        Mas.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cont++;
                        Contador.setText(String.valueOf(cont));
                    }
                }

        );

        Menos.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cont--;
                        Contador.setText(String.valueOf(cont));
                    }
                }

        );

    }

}