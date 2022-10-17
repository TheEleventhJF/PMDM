package com.example.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejemplo1.R;

public class Lanzador extends AppCompatActivity {

    static String preMensaje = ".";
    Button bLanzador;
    EditText tNombreLanzador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanzador);

        bLanzador = findViewById(R.id.bLanzador);
        tNombreLanzador = findViewById(R.id.tNombreLanzador);

        bLanzador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzar();
            }
        });

    }

    private void lanzar() {
        Intent intento = new Intent(this, Receptor.class);
        String mensaje = tNombreLanzador.getText().toString();
        intento.putExtra(preMensaje, "Hola " + mensaje + "!!!!!!");
        startActivity(intento);
    }

}