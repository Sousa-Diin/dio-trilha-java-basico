package com.soluttep.singleton;

/* 
 * @autor Sousa-Diin
 * 
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){} // default

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
    
}
