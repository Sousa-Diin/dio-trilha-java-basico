package com.sousadiin.model.decorator;

import com.sousadiin.model.Veiculo;

/**
 *
 * @author Wildes Sousa
 */
public class BancoCouro extends DecoratorAcessorios{

    public BancoCouro(Veiculo v) {
        super(v);
    }

    @Override
    public double preco() {
        return getVeiculo().preco() + 8000;
    }
    
}
