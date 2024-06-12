package com.sousadiin.devices.browser;

public class Chrome implements NavegadorDeInternet{

    @Override
    public void showPage(String url) {
        System.out.println("você esta navegando na [www." + url + ".com.br]");
    }

    @Override
    public void addNewTab() {
        System.out.println("Abrindo nova url.");
    }

    @Override
    public void reflashPage() {
        System.out.println("Restartando a page, aguarde...");
    }

    
}