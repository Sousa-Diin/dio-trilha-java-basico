package utilitarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import banco.Banco;
import conta.Conta;
import instituicaoBancaria.Bradesco;
import instituicaoBancaria.Caixa;
import instituicaoBancaria.Itau;
import instituicaoBancaria.MercadoPago;
import instituicaoBancaria.NuBank;
import instituicaoBancaria.PicPay;
import instituicaoBancaria.Santander;
import personas.Cliente;

public final class SimulacaoBanco {

    //public SimulacaoBanco(){}
    static List<Banco> simulacaoListaBancos;
    static List<Cliente> simulacaoListaClientes;
    static Banco caixa, itau, nubank,picpay,
        mercadopago, santander, bradesco, bancoAtual; 
    static Conta contaAtual;
    
    
    public static void simular (){
        SimulacaoBanco.simulacaoListaBancos = new ArrayList<>();
        SimulacaoBanco.simulacaoListaClientes = new ArrayList<>();
        caixa = new Caixa("Caixa", 3);
        Scanner sc = new Scanner(System.in);
        int op;
        
        String [] menu = {"CRIAR CLIENTES", "CRIAR BANCOS","LISTAR CLIENTES","LISTAR BANCOS","OPERAÇÕES CLIENTE","OPERAÇÕES BANCO", "SAIR"};
        String nameTeste ="underfined";
        String numberStrTeste ="underfined_number";
        
        try {

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
                        String [] banks = {"Caixa","NuBank","Itau","Pic Pay","Mercado Pago","Santander","Bradesco"};
                        criaListMenu(banks);
    
                        int op2 = sc.nextInt();
                        switch (op2) {
                            case 1:
                                //caixa = new Caixa("Caixa", 3);
                                simulacaoListaBancos.add(caixa);
                                break;
                            case 2:
                                nubank = new NuBank("NuBank", 1);
                                simulacaoListaBancos.add(nubank);
                                break;
                            case 3:
                                itau = new Itau("Itaú", 3);
                                simulacaoListaBancos.add(itau);
                                break;
                            case 4:
                                picpay = new Itau("Pic Pay", 3);
                                simulacaoListaBancos.add(picpay);
                                break;
                            case 5:
                                mercadopago = new Itau("Mercado Pago", 3);
                                simulacaoListaBancos.add(mercadopago);
                                break;
                            case 6:
                                santander = new Itau("Santander", 3);
                                simulacaoListaBancos.add(santander);
                                break;
                            case 7:
                                bradesco = new Itau("Bradesco", 3);
                                simulacaoListaBancos.add(bradesco);
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
                        System.out.print(String.format("\n|%12s","  _____________________________________________"));
                        System.out.print(String.format("\n|%-12s | %-12s| %-16s|","CÓDIGO", "BANCO", "TIPO"));
                        System.out.print(" _____________________________________________");
                        for (Banco banco : simulacaoListaBancos) {
                            System.out.println(banco);
                        }
                        break;
                    case 5:
                        System.out.println("Operações cliente");
                        throw new Exception("metodo ainda não implementado.");
                    case 6:
                        System.out.println("Operações banco");
                        processarOperacoes(sc);
                        break;
                    case 7:
                        System.out.println("Saindo...");
                        break;
                
                    default:
                        System.out.println("Opção invalida.");
                        break;
                }
            }while( op != 7);
            
           
        
            
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
   }   

    private static void processarOperacoes( Scanner sc ) {
        String listOperacoesBancarias [] = {"Abrir conta", "sacar", "Depositar", "Tranferir para", "Pix","OpenFinance"," <- voltar"};
        int op3;

        do {
            System.out.println("\n############# - CAIXA ELETRONICO - ################\n");
            criaListMenu(listOperacoesBancarias);
            op3 = sc.nextInt();
            switch (op3) {
                case 1:
                    System.out.println("Abrir conta.");  
                    escolherBanco(sc);
                    break;
                case 2:
                    System.out.println("Sacando.");                
                    break;
                case 3:
                    System.out.println("Depositando.");                
                    break;
                case 4:
                    System.out.println("Transferindo.");                
                    break;
                case 5:
                    System.out.println("Operações Pix.");                
                    break;
                case 6:
                    System.out.println("OpenFinance.");                
                    break;
                case 7:
                    System.out.println("voltando ao menu pricipal.");   
                             
                    break;
            
                default:
                    System.out.println("Opção invalida.");
                    
                    break;
            }
            //System.out.println("Fim switch" );
            
        }while (op3 != 7);
        //System.out.println("Fim do while interno");
      
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
    static void escolherBanco (Scanner sc){
        if(simulacaoListaBancos.isEmpty()){
            System.out.println("Atenção para fazer operaçõe bancarias.\n É necessario criar um banco primeiro.\n");
            return;
        }else{
            System.out.println("\nBancos criados.\n");
            for (Banco banco : simulacaoListaBancos) {
                System.out.println(banco);
            }
        }
        System.out.println("Entre com o código do banco\n\n>" );
       sc.next();
        String buscado = sc.nextLine();
        bancoAtual = buscarBanco(buscado);
        contaAtual = new Conta(simulacaoListaClientes.get(1));

        contaAtual.imprimirInfosComuns();
        simulacaoListaBancos.get(1).addConta(contaAtual.getAgencia(),contaAtual);

        int count = 0;
        for (Banco banco : simulacaoListaBancos) {
            
            banco.getBanco(count).imprimirInfosComuns();
            count++;
        }
        
    }
      /**
     * Faz a busca dos ambientes 
     * @param Nome
     * @return Banco
     */
    private static Banco buscarBanco(String nome){
        for(Banco a  : simulacaoListaBancos){
           if(a instanceof Caixa){
               if(((Caixa) a).getNome().equals(nome)){
                   return a;
               }
           }else if (a instanceof NuBank){
               if(((NuBank) a).getNome().equals(nome))
                    return a;
           }else if (a instanceof PicPay){
                if(((PicPay) a).getNome().equals(nome))
                    return a;
           }else if (a instanceof MercadoPago){
                if(((MercadoPago) a).getNome().equals(nome))
                    return a;
            }else if (a instanceof Bradesco){
                if(((Bradesco) a).getNome().equals(nome))
                     return a;
            }else if (a instanceof Itau){
                 if(((Itau) a).getNome().equals(nome))
                     return a;
            }else if (a instanceof Santander){
                 if(((Santander) a).getNome().equals(nome))
                     return a;
            }else{
               return a;
            }
            
        
        }
        return null;
    }

    /*
     * 
     * // Classe para comparar Livro por autor
class CompararAutor implements Comparator<Livro> {
  @Override
  public int compare(Livro l1, Livro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}
}

// Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro> {
  @Override
  public int compare(Livro l1, Livro l2) {
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
	}
}

class CompararAnoAutorTitulo implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		int ano = Integer.compare(l1.getAno(), l2.getAno());
		if (ano != 0)
			return ano;
		int autor = l1.getAutor().compareTo(l2.getAutor());
		if (autor != 0)
			return autor;
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
     */

     /*
Versão genérica da classe Box.
@param <T> o tipo do valor sendo armazenado

public class Box<T> {
	// T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}*/
    
}
