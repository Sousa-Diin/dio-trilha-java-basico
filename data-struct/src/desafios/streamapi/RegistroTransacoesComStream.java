package desafios.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
          
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S') {
                saldo -= valorTransacao;
            }
        }

        System.out.println("\nSaldo : " + saldo);
        System.out.println("\nTransacoes:");
        transacoes.stream()
                .map(transacao -> "TODO: Formatar a Saída (tipo e valor) de acordo com os Exemplos.")
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
    
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}