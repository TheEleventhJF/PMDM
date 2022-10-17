package com.example.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class PiedraPapelTijera extends AppCompatActivity implements View.OnClickListener {

    TextView tEleccionMaquina, tTurno, tPuntuacionTu, tPuntuacionIA;
    ImageButton bPiedra, bPapel, bTijeras;
    Button bReset;
    int contTu=0, contIA=0, eleccionMaquina, eleccionTu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedra_papel_tijera);

        tEleccionMaquina = findViewById(R.id.tEleccionMaquina);
        tTurno = findViewById(R.id.tTurno);
        tPuntuacionTu = findViewById(R.id.tPuntuacionTu);
        tPuntuacionIA = findViewById(R.id.tPuntuacionIA);
        bPiedra = findViewById(R.id.bPiedra);
        bPapel = findViewById(R.id.bPapel);
        bTijeras = findViewById(R.id.bTijeras);
        bReset = findViewById(R.id.bReset);

        bPiedra.setOnClickListener(this);
        bPapel.setOnClickListener(this);
        bTijeras.setOnClickListener(this);
        bReset.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bPiedra:
                eleccionMaquina = (int) (Math.random()*3);
                eleccionTu = 1;
                if (eleccionMaquina == 1) {
                    contIA++;
                    contTu++;
                    tEleccionMaquina.setText("La máquina ha sacado piedra");
                    tTurno.setText("Empate");
                } else if (eleccionMaquina == 2) {
                    contIA++;
                    tEleccionMaquina.setText("La máquina ha sacado papel");
                    tTurno.setText("Pierdes");
                } else {
                    contTu++;
                    tEleccionMaquina.setText("La máquina ha sacado tijeras");
                    tTurno.setText("Ganas");
                }
                break;
            case R.id.bPapel:
                eleccionMaquina = (int) (Math.random()*3);
                eleccionTu = 2;
                if (eleccionMaquina == 2) {
                    contIA++;
                    contTu++;
                    tEleccionMaquina.setText("La máquina ha sacado papel");
                    tTurno.setText("Empate");
                } else if (eleccionMaquina == 3) {
                    contIA++;
                    tEleccionMaquina.setText("La máquina ha sacado tijeras");
                    tTurno.setText("Pierdes");
                } else {
                    contTu++;
                    tEleccionMaquina.setText("La máquina ha sacado piedra");
                    tTurno.setText("Ganas");
                }
                break;
            case R.id.bTijeras:
                eleccionMaquina = (int) (Math.random()*3);
                eleccionTu = 3;
                if (eleccionMaquina == 3) {
                    contIA++;
                    contTu++;
                    tEleccionMaquina.setText("La máquina ha sacado tijeras");
                    tTurno.setText("Empate");
                } else if (eleccionMaquina == 1) {
                    contIA++;
                    tEleccionMaquina.setText("La máquina ha sacado piedra");
                    tTurno.setText("Pierdes");
                } else {
                    contTu++;
                    tEleccionMaquina.setText("La máquina ha sacado papel");
                    tTurno.setText("Ganas");
                }
                break;
            case R.id.bReset:
                contTu=0;
                contIA=0;
                break;
        }

        asignar(contIA, contTu);

    }

    public void asignar (int x, int y) {
        tPuntuacionTu.setText(String.valueOf(contTu));
        tPuntuacionIA.setText(String.valueOf(contIA));
    }

}