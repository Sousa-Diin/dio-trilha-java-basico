import java.util.Scanner;
import contabancaria.Conta;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, Digital Innovation One!");
        insert();

    }

    public static void insert() {
        int numAg;
        String ag;
        String client;
        double account_balance;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        numAg = sc.nextInt();
        System.out.print("Por favor, digite o número da Agência: ");
        sc.nextLine(); // clear buffer
        ag = sc.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        client = sc.nextLine();
        System.out.print("Por favor, digite o saldo: ");
        account_balance = sc.nextDouble();

        sc.close();
        Conta conta = new Conta(numAg, ag, client, account_balance);
        conta.print();
    }
}
