package instituicaoBancaria;

import java.util.List;

import banco.Banco;
import conta.Conta;
import personas.Cliente;

public class Caixa extends Banco{

    public Caixa(String nome, int tipo) {
        super(nome, tipo);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void criarConta(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarConta'");
    }

    @Override
    public void addConta(Conta conta) {
        // TODO Auto-generated method stub
        super.addConta(conta);
    }

    @Override
    public int getCod() {
        // TODO Auto-generated method stub
        return super.getCod();
    }

    @Override
    protected List<Conta> getListaContas() {
        // TODO Auto-generated method stub
        return super.getListaContas();
    }

    @Override
    protected String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    protected String getTipo() {
        // TODO Auto-generated method stub
        return super.getTipo();
    }

    @Override
    protected void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    protected void setTipo(int tipo) {
        // TODO Auto-generated method stub
        super.setTipo(tipo);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
}
