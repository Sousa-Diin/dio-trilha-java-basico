package instituicaoBancaria;

import banco.Banco;
import conta.Conta;
import personas.Cliente;

public class NuBank extends Banco{

    public NuBank(String nome, int tipo) {
        super(nome, tipo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void addConta(Conta conta) {
        // TODO Auto-generated method stub
        super.addConta(conta);
    }

    @Override
    protected void criarConta(Cliente cliente) {
        if ( isClienteCadastrado(cliente) ){
            System.out.println("Essa conta já está cadastrada.");
            return;
        }else {
            this.addConta(new Conta(cliente));
        }
        
    }

    Boolean isClienteCadastrado(Cliente cliente){
        return false;
    }

    
}
