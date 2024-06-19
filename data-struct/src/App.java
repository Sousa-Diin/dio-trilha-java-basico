import exercises.list.Lista;

import java.util.Scanner;
import exercises.Carrinho;
import exercises.list.Lista;

public class App {
    public static void main(String[] args) throws Exception {

       Menu();

    }

    /**
     * @param op
     */
    public static void Menu(){

        Scanner entrada = new Scanner( System.in );
        Lista mercadoLivre = new Lista();
        int op;

       do{
            phraseOp(); 
            op = entrada.nextInt();
            switch ( op ){
                case 1 : 
                    System.out.println("\nAdicionando elementos:\n");

                    mercadoLivre.add(new Carrinho(100, 1, "Mouse", 39.9));
                    System.out.println("Feito.");
                    System.out.println();
                    break;
                case 2: 
                    System.out.println("\nRemovendo Item[110]\n");
                    mercadoLivre.remove(110);
                    System.out.println();
                    break;
                case 3:
                    mercadoLivre.show();
                    System.out.println();
                    break;
                case 4: 
                
                    System.out.println("Total da lista: " + mercadoLivre.getTotCountList());
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Fim da simulação!!");
                    break;
                default:
                    System.out.println("opção invalida.");
            }

        } while(op != 0);
        
        entrada.close();
    }

    public static void phraseOp (){
        
        System.out.println("\n***********MENU************\n\n");
        System.out.print(
            "\n1 - Inserir dados.\n" +
            "\n2 - Remover dados.\n" +
            "\n3 - Listar dados.\n" +
            "\n4 - visualizar tamanho da lista de dados.\n" +
            "\n0 - Sair.\n"+
            "\n> "
        );
    }

    public static void processarDados(int op){
        
    
    }
}
