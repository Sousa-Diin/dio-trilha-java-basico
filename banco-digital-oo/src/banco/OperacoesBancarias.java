package banco;
import personas.Cliente;

public interface OperacoesBancarias {

    void sacar (double valor);
    void depositar (double valor);
    void transferir (double valor, OperacoesBancarias contaDestino);
    void receberPix (double valor, OperacoesBancarias contaDestino);
    void pagarPix (double valor, OperacoesBancarias contaDestino);
    void openFinance (Cliente visualizarDadosClienteOf);
}
