package utilitarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import banco.Banco;
import instituicaoBancaria.Caixa;
import instituicaoBancaria.Itau;
import instituicaoBancaria.NuBank;
import personas.Cliente;

public final class SimulacaoBanco {

    //public SimulacaoBanco(){}
    
    public static void simular (){
        Scanner sc = new Scanner(System.in);
        int op;
        List<Banco> simulacaoListaBancos = new ArrayList<>();
        List<Cliente> simulacaoListaClientes = new ArrayList<>();
        String [] menu = {"CRIAR CLIENTES", "CRIAR BANCOS","LISTAR CLIENTES","LISTAR BANCOS","OPERAÇÕES CLIENTE","OPERAÇÕES BANCO", "SAIR"};
        String nameTeste ="underfined";
        String numberStrTeste ="underfined_number";

        do{
            System.out.println("\n############# - SIMULAÇÃO DE BANCOS - [CLIENTE & BANCO] ################\n");
            criaListMenu(menu);
            op = sc.nextInt();

            switch (op) {
                case 1:

                    System.out.println("*****************Criando cliente******************\n");
                   
                    System.out.println("Digite o nome do cliente:\n");
                    System.out.print(">");
                    nameTeste = sc.next();

                    System.out.println("Digite o CPF do cliente:\n");
                    System.out.print(">");                  
                    numberStrTeste = sc.next();

                    simulacaoListaClientes.add(new Cliente(nameTeste, numberStrTeste));
                    System.out.println("Cliente criado com sucesso!");
                    System.out.println(simulacaoListaClientes.size()+"\n");
                    break;
                case 2:

                    System.out.println("*****************Criando Banco********************\n");
                    String [] banks = {"Caixa","NuBank","Itau"};
                    criaListMenu(banks);

                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            Banco caixa = new Caixa("Caixa", 3);
                            simulacaoListaBancos.add(caixa);
                            break;
                        case 2:
                            Banco nuConta = new NuBank("Caixa", 1);
                            simulacaoListaBancos.add(nuConta);
                            break;
                        case 3:
                            Banco itau = new Itau("Itaú", 3);
                            simulacaoListaBancos.add(itau);
                            break;
                    
                        default:
                        System.out.println("Opção invalida.");
                            break;
                    }                    
                    break;
                case 3:
                    System.out.println("############# - LISTA DOS CLIENTES - ################");
                    for (Cliente cliente : simulacaoListaClientes) {
                        System.out.println(cliente);
                    }
                    break;
                case 4:
                    System.out.println("############# - LISTA DOS BANCOS - ################");
                    for (Banco banco : simulacaoListaBancos) {
                        System.out.println(banco);
                    }
                    break;
                case 5:
                    System.out.println("Operações cliente");
                    break;
                case 6:
                    System.out.println("Operações banco");
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }while( op != 7);
        
        sc.close();
    }

    private static void criaListMenu(String[] menu){
        try {
            if (menu.length == 0){
                throw new Exception("Array vazio");
                
            }
            int count = 1;
            for (String itemMenu : menu) {
            System.out.println("[" + count++ + "] - " + itemMenu); 
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.print("\n> ");

    }
}
