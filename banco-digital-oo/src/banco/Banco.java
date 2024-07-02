package banco;

import java.util.ArrayList;
import java.util.HashMap;

import conta.Conta;

public abstract class Banco {
    private static int auxCod = 0;
    protected  int cod = 100;
    protected String tipo;//Tipo: Fisico ou Digital
    protected String nome;
    protected HashMap<Integer,Conta> contas;

    public Banco ( String nome, int tipo){
        this.nome = nome;
        this.contas = new HashMap<>();
        this.cod += Banco.auxCod++;
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

    public void addConta (int agencia, Conta conta){

        contas.put(agencia, conta);
    }

    public Conta getBanco (int agencia){

        return contas.get(agencia);
    }
    
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
 
    protected ArrayList<Conta> getListaContas() {
        return new ArrayList<>(contas.values());
    }

    @Override
    public String toString() {
        return String.format("\n|%-12d | %-12s| %-16s|\n",getCod(), getNome(), getTipo());
    }

    public Conta getAgencia(int agencia){
        if(contas.isEmpty())
            return null;
        return contas.get(agencia);

    }

    

}
