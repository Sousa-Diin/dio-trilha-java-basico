package com.sousadiin.model.decorator;

import com.sousadiin.model.Veiculo;

/**
 *
 * @author Wildes Sousa
 */
public class DirecaoHidraulica extends DecoratorAcessorios{

    public DirecaoHidraulica(Veiculo v) {
        super(v);
    }

    @Override
    public double preco() {
        return 1500 + getVeiculo().preco();
    }
    
}
