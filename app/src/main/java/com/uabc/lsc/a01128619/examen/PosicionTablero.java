package com.uabc.lsc.a01128619.examen;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.widget.Button;

/**
 * Created by SoporteCEA on 29/03/2017.
 */

public class PosicionTablero extends AppCompatButton {
    private int posX;
    private int posY;
    public PosicionTablero(Context context) {
        super(context);
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
