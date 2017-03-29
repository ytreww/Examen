package com.uabc.lsc.a01128619.examen;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    private int turno = 0;
    private int jugadorUnoPuntos=0;
    private int jugadorDosPuntos=0;
    private String jugadorUnoMovimiento;
    private String jugadorDosMovimiento;
    boolean juegoTerminado=true;
    DialogFragment framentoAviso = new FragmentoAvisos();
    Comunicacion comunicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        // Inicializacion de los botones
        x00 = (Button) findViewById(R.id.button_1);
        x01 = (Button) findViewById(R.id.button_2);
        x02 = (Button) findViewById(R.id.button_3);
        x10 = (Button) findViewById(R.id.button_4);
        x11 = (Button) findViewById(R.id.button_5);
        x12 = (Button) findViewById(R.id.button_6);
        x20 = (Button) findViewById(R.id.button_7);
        x21 = (Button) findViewById(R.id.button_8);
        x22 = (Button) findViewById(R.id.button_9);
        x00.setOnClickListener(this);
        x01.setOnClickListener(this);
        x02.setOnClickListener(this);
        x10.setOnClickListener(this);
        x11.setOnClickListener(this);
        x12.setOnClickListener(this);
        x20.setOnClickListener(this);
        x21.setOnClickListener(this);
        x22.setOnClickListener(this);
        comunicacion = new Comunicacion();
        actualizar();
    }

    @Override
    public void onClick(View v) {
        Button button = (Button)v;

        String jugadorUno = "X";
        String jugadorDos = "O";
        if(getTurno()==0){

        }


    }

    public void enviarMovimiento(){

    }


    public void actualizar(){
        framentoAviso.show(getFragmentManager(), "Aviso");
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getJugadorUnoPuntos() {
        return jugadorUnoPuntos;
    }

    public void setJugadorUnoPuntos(int jugadorUnoPuntos) {
        this.jugadorUnoPuntos = jugadorUnoPuntos;
    }

    public int getJugadorDosPuntos() {
        return jugadorDosPuntos;
    }

    public void setJugadorDosPuntos(int jugadorDosPuntos) {
        this.jugadorDosPuntos = jugadorDosPuntos;
    }

    public String getJugadorUnoMovimiento() {
        return jugadorUnoMovimiento;
    }

    public void setJugadorUnoMovimiento(String jugadorUnoMovimiento) {
        this.jugadorUnoMovimiento = jugadorUnoMovimiento;
    }

    public String getJugadorDosMovimiento() {
        return jugadorDosMovimiento;
    }

    public void setJugadorDosMovimiento(String jugadorDosMovimiento) {
        this.jugadorDosMovimiento = jugadorDosMovimiento;
    }
}
