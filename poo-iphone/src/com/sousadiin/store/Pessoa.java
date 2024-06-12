package com.sousadiin.store;

import com.sousadiin.devices.browser.Chrome;
import com.sousadiin.devices.phone.Iphone;
import com.sousadiin.devices.player.Mp4;
import com.sousadiin.smartphone.SmartPhone;

public class Pessoa {

    public static void main(String[] args) {

        SmartPhone spn = new SmartPhone();

        Chrome chr = new Chrome(); 
        Iphone ipn = new Iphone();
        Mp4 mp4 = new Mp4();

        chr.showPage("digitalinnovationone");
        ipn.ligar("35991495521");
        String music = mp4.selecionarMusica("Bee Gees");
        System.out.println(music);

        spn.reflashPage();
    }
}