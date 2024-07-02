package instituicaoBancaria;

import banco.Banco;
import personas.Cliente;

public class MercadoPago extends Banco{

    public MercadoPago(String nome, int tipo) {
        super(nome, tipo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int getCod() {
        // TODO Auto-generated method stub
        return super.getCod();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return super.getTipo();
    }

    Boolean isClienteCadastrado(Cliente cliente){
        return false;
    }

   

    
}
