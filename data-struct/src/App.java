package src;

import src.exercises.Lista;
import src.exercises.list.Carrinho;

public class App {
    public static void main(String[] args) throws Exception {

       Lista mercadoLivre = new Lista();
       System.out.println("Total da lista: " + mercadoLivre.getTotCountList());

       System.out.println("\nAdicionando elementos:\n");
       mercadoLivre.add(new Carrinho(100, 1, "Mouse", 39.9));
       mercadoLivre.show();
       System.out.println("Feito.");

       System.out.println("\nTotal da lista: " + mercadoLivre.getTotCountList());

       System.out.println("Adicionando elementos:\n");
       mercadoLivre.add(new Carrinho(110, 2, "SSD", 219.8));
       mercadoLivre.add(new Carrinho(111, 3, "pen drive", 69.9));
       mercadoLivre.show();
       System.out.println("Feito.");

       System.out.println("\nTotal da lista: " + mercadoLivre.getTotCountList());
       System.out.println("\nRemovendo Item[110]\n");
       mercadoLivre.remove(110);
       mercadoLivre.show();
       System.out.println("Feito.");

       System.out.println("Adicionando elementos:\n");
       mercadoLivre.add(new Carrinho(120, 7, "fone", 89.9));
       mercadoLivre.show();
       System.out.println("Feito.");

       System.out.println("\nTotal da lista: " + mercadoLivre.getTotCountList());
    }
}
