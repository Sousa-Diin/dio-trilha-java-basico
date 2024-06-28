package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import conta.Conta;
import personas.Cliente;

public abstract class Banco {
    protected static int cod = 100;
    protected String tipo;
    protected String nome;
    protected List<Cliente> clientes;

    Banco ( String nome, char tipo){
        this.nome = nome;
        this.clientes = new ArrayList<>();
        Banco.setCod(cod++);
        this.tipo = clacificaTipo(tipo);
    }

    public static int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    private static void setCod(int cod) {
        Banco.cod = cod;
    }

    public void setTipo(char tipo) {
        this.tipo = clacificaTipo(tipo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente (Cliente cliente){
        clientes.add(cliente);
    }

    public void criarConta (Conta conta){
        
    }

    private String clacificaTipo(char tipo){
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
 
    public List<Cliente> getListaClientes() {
        return Collections.unmodifiableList(clientes);
    }
}
