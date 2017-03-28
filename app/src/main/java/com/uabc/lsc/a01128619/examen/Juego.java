package com.uabc.lsc.a01128619.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Juego extends AppCompatActivity implements View.OnClickListener{

    // Posiciones del tablero
    private Button x00;
    private Button x01;
    private Button x02;
    private Button x10;
    private Button x11;
    private Button x12;
    private Button x20;
    private Button x21;
    private Button x22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        // Inicializacion de los botones
        x00 = (Button) findViewById(R.id.button_1);
        x01 = (Button) findViewById(R.id.button_1);
        x02 = (Button) findViewById(R.id.button_1);
        x10 = (Button) findViewById(R.id.button_1);
        x11 = (Button) findViewById(R.id.button_1);
        x12 = (Button) findViewById(R.id.button_1);
        x20 = (Button) findViewById(R.id.button_1);
        x21 = (Button) findViewById(R.id.button_1);
        x22 = (Button) findViewById(R.id.button_1);
        x00.setOnClickListener(this);
        x01.setOnClickListener(this);
        x02.setOnClickListener(this);
        x10.setOnClickListener(this);
        x11.setOnClickListener(this);
        x12.setOnClickListener(this);
        x20.setOnClickListener(this);
        x21.setOnClickListener(this);
        x22.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
