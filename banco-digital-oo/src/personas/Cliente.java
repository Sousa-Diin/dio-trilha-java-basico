package personas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import conta.Conta;

public class Cliente {
    private String name;
    private String cpf;
    private List<Conta> contas;

    Cliente(String cpf, String name){
        this.name = name;
        this.cpf = cpf;
        this.contas = new ArrayList<Conta>();
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Conta> getBancos() {
        return Collections.unmodifiableList(contas);
    }
    

}
