package com.example.tunombre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tPregunta;
    TextView tSalida;
    Button bAceptar;
    EditText iNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tPregunta = findViewById(R.id.tPregunta);
        tSalida = findViewById(R.id.tSalida);
        bAceptar = findViewById(R.id.bAceptar);
        iNombre = findViewById(R.id.iNombre);

        bAceptar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tSalida.setText(getString(R.string.tSalida) + iNombre.getText());
                        iNombre.setText("");
                    }
                }
        );
    }
}