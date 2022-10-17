package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tContAll, tCont1, tCont2, tCont3, tCont4;
    Button bResetAll, bMas1_1, bReset1, bMas1_2, bReset2, bMas1_3, bReset3, bMas1_4, bReset4;
    int[] conts = {0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tContAll =findViewById(R.id.tContAll);
        bResetAll =findViewById(R.id.bResetAll);
        tCont1 =findViewById(R.id.tCont1);
        bMas1_1 =findViewById(R.id.bMas1_1);
        bReset1 =findViewById(R.id.bReset1);
        tCont2 =findViewById(R.id.tCont2);
        bMas1_2 =findViewById(R.id.bMas1_2);
        bReset2 =findViewById(R.id.bReset2);
        tCont3 =findViewById(R.id.tCont3);
        bMas1_3 =findViewById(R.id.bMas1_3);
        bReset3 =findViewById(R.id.bReset3);
        tCont4 =findViewById(R.id.tCont4);
        bMas1_4 =findViewById(R.id.bMas1_4);
        bReset4 =findViewById(R.id.bReset4);

        bResetAll.setOnClickListener(this);
        bMas1_1.setOnClickListener(this);
        bReset1.setOnClickListener(this);
        bMas1_2.setOnClickListener(this);
        bReset2.setOnClickListener(this);
        bMas1_3.setOnClickListener(this);
        bReset3.setOnClickListener(this);
        bMas1_4.setOnClickListener(this);
        bReset4.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bResetAll:
                for (int i=0;i< conts.length;i++) {
                    conts[i]=0;
                }
                break;
            case R.id.bMas1_1:
                conts[0]++;
                conts[1]++;
                break;
            case R.id.bReset1:
                conts[1]=0;
                break;
            case R.id.bMas1_2:
                conts[0]++;
                conts[2]++;
                break;
            case R.id.bReset2:
                conts[2]=0;
                break;
            case R.id.bMas1_3:
                conts[0]++;
                conts[3]++;
                break;
            case R.id.bReset3:
                conts[3]=0;
                break;
            case R.id.bMas1_4:
                conts[0]++;
                conts[4]++;
                break;
            case R.id.bReset4:
                conts[4]=0;
                break;
        }
        asignar(conts);
    }

    public void asignar(int[] x) {
        tContAll.setText(String.valueOf(conts[0]));
        tCont1.setText(String.valueOf(conts[1]));
        tCont2.setText(String.valueOf(conts[2]));
        tCont3.setText(String.valueOf(conts[3]));
        tCont4.setText(String.valueOf(conts[4]));
    }
}