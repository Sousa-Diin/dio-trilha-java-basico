package com.sousadiin.devices.phone;

public class Iphone implements AparelhoTelefonico {

    @Override
    public boolean ligar(String number) {
        // TODO Auto-generated method stub
        Boolean check = true;
        try {
            if (number == ""){
                check = false;
                throw new UnsupportedOperationException("Unimplemented method 'atender'");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
        System.out.println("Lingando para o número" + number);
        return check;
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo o IPHONE.");
    }

    @Override
    public void iniciarcorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz.");
    }

    
}