package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import conta.Conta;
import personas.Cliente;

public abstract class Banco {
    protected  int cod = 100;
    protected String tipo;//Tipo: Fisico ou Digital
    protected String nome;
    protected List<Conta> contas;

    public Banco ( String nome, int tipo){
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.cod++;
        this.tipo = clacificaTipo(tipo);
    }

    public int getCod() {
        return cod;
    }

    protected String getNome() {
        return this.nome;
    }

    protected String getTipo(){
        return this.tipo;
    }

    protected void setTipo(int tipo) {
        this.tipo = clacificaTipo(tipo);
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public void addConta (Conta conta){

        contas.add(conta);
    }

    protected abstract void criarConta (Cliente cliente);
    
    private String clacificaTipo(int tipo){
        String tempTipo = "underfined";
        switch (tipo) {
            case 1:
                tempTipo = "físico";             
                break;
            case 2:
                tempTipo = "digital";
                break;
            case 3:
                tempTipo = "físico/digital";             
                break;
            default:
                break;
        }
        return tempTipo;
    }
 
    protected List<Conta> getListaContas() {
        return Collections.unmodifiableList(contas);
    }

    @Override
    public String toString() {
        return "Cod: " + getCod() + "\nTipo " + getTipo() + "\nNome: " + getNome() + "\n";
    }

    

}
