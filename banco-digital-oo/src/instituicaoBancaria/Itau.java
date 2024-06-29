package instituicaoBancaria;

import java.util.List;

import banco.Banco;
import conta.Conta;
import personas.Cliente;

public class Itau extends Banco{

    public Itau(String nome, int tipo) {
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
        // TODO Auto-generated method stub
        
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

}
