package com.sousadiin.model;

/**
 *
 * @author Wildes Sousa
 */
public class Esportivo extends Veiculo{

    public Esportivo(String descricao) {
        super(descricao);
    }

    
    @Override
    public double preco() {
        return 45000;
    }
    
}
