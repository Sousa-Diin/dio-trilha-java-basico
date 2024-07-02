package conta;

import banco.OperacoesBancarias;
import personas.Cliente;


public class Conta implements OperacoesBancarias{

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente; 

    public Conta ( Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    @Override
    public void openFinance(Cliente visualizarDadosClienteOf) {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void pagarPix(double valor, OperacoesBancarias contaDestino) {
        this.sacar(valor);
		contaDestino.depositar(valor);
        
    }

    @Override
    public void receberPix(double valor, OperacoesBancarias contaDestino) {
        contaDestino.sacar(valor);
        this.saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        
    }

    @Override
    public void transferir(double valor, OperacoesBancarias contaDestino) {
        this.sacar(valor);
		contaDestino.depositar(valor);
        
    }

    
	public void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getName()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

    public static int getAgenciaPadrao() {
        return AGENCIA_PADRAO;
    }

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
}