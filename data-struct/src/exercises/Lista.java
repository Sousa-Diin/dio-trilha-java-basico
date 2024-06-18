package exercises;

import java.util.ArrayList;
import java.util.List;

public class Lista {
   
    private List <Carrinho> list;

    public Lista() {
        this.list = new ArrayList<>();
    }

    public void add (Carrinho e){
        list.add(e);
    }
    public void remove (int id){
        for (Carrinho carrinho : list) {
            if (carrinho.getId() == id){
                list.remove(carrinho);
            }
        }  
    }

    public int getTotCountList(){
        return list.size();
    }

    public void show (){
        for (Carrinho carrinho : list) {
           System.out.println(carrinho.toString());
            
        } 
    }
   


}
