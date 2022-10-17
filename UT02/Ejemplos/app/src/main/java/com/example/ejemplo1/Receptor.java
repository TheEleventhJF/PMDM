package com.example.ejemplo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class Receptor extends Activity {

    EditText tSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_receptor);
        tSaludo=findViewById(R.id.tSaludo);

        Intent intento = getIntent();
        String mensaje = intento.getStringExtra(Lanzador.preMensaje);

        tSaludo.setText(mensaje);

    }
}
