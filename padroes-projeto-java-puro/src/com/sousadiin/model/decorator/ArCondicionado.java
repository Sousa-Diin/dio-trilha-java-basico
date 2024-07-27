package com.sousadiin.model.decorator;

import com.sousadiin.model.Veiculo;

/**
 *
 * @author Wildes Sousa
 */
public class ArCondicionado extends DecoratorAcessorios{

    public ArCondicionado(Veiculo v) {
        super(v);
    }

    @Override
    public double preco() {
        return 2500 + getVeiculo().preco();
    }
    
}
