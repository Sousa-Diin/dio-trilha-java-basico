package com.sousadiin.model.decorator;

import com.sousadiin.model.Veiculo;

/**
 *
 * @author Wildes Sousa
 */
public abstract class DecoratorAcessorios extends Veiculo{
    private Veiculo v;

    public DecoratorAcessorios(Veiculo v) {
        super(v.getDescricao());
        this.v = v;
        
        
    }

    public Veiculo getVeiculo() {
        return v;
    }
    
}