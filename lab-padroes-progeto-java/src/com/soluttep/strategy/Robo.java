package com.soluttep.strategy;

public class Robo {
    private Comportamento comportamneto;

    public void setComportamneto(Comportamento comportamneto) {
        this.comportamneto = comportamneto;
    };

    public void mover(){
        comportamneto.mover();
    }
}
