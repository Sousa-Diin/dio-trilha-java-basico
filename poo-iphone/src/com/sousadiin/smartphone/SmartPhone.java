package com.sousadiin.smartphone;

import com.sousadiin.devices.browser.NavegadorDeInternet;
import com.sousadiin.devices.phone.AparelhoTelefonico;
import com.sousadiin.devices.player.ReprodutorMusical;

public class SmartPhone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Ouvindo muisica via SMARTPHONE");
    }

    @Override
    public Boolean pausar() {
        System.out.println("Pausar muisica via no SMARTPHONE");
        return true;
    }

    @Override
    public String selecionarMusica(String music) {
        System.out.println("Selecionando a musica[ " + music + " ] no SMARTPHONE");
        return music;
    }

    @Override
    public void showPage(String url) {
        System.out.println("Navegando pela: " + url + " via SMARTPHONE");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionado outra url no navegador do SMARTPHONE");
    }

    @Override
    public void reflashPage() {
        System.out.println("Atualizando pagina via SMARTPHONE");
    }

    @Override
    public boolean ligar(String number) {
        System.out.println("Ligando para o ( " + number + ") via SMARTPHONE");
        return number != "" ? true : false;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação via SMARTPHONE");
    }

    @Override
    public void iniciarcorreioVoz() {
        System.out.println("Iniciando correio de voz via SMARTPHONE");
    }
    
}
