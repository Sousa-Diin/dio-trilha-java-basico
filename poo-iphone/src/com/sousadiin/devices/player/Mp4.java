package com.sousadiin.devices.player;

public class Mp4 implements ReprodutorMusical{

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando musica.");
    }

    @Override
    public Boolean pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando musica.");
        return true;
    }

    @Override
    public String selecionarMusica(String music) {
        // TODO Auto-generated method stub
        System.out.println("Selecione uma faixa.");
        return music;
    }
    
}
