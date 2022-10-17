package com.example.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ejemplo2 extends AppCompatActivity {

    TextView Nombre, Correo, Telefono;
    EditText tNombre, tCorreo, tTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo2);

        tNombre = findViewById(R.id.tNombre);
        Nombre = findViewById(R.id.Nombre);
        tCorreo = findViewById(R.id.tCorreo);
        Correo = findViewById(R.id.Correo);
        tTelefono = findViewById(R.id.tTelefono);
        Telefono = findViewById(R.id.Telefono);

    }

}