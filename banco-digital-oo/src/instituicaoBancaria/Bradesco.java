package instituicaoBancaria;

import java.util.List;

import banco.Banco;
import conta.Conta;
import personas.Cliente;

public class Bradesco extends Banco{

    public Bradesco(String nome, int tipo) {
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

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public void setTipo(int tipo) {
        // TODO Auto-generated method stub
        super.setTipo(tipo);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
}
