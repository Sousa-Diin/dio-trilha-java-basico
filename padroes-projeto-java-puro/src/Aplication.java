import com.sousadiin.model.Esportivo;
import com.sousadiin.model.Passeio;
import com.sousadiin.model.Veiculo;
import com.sousadiin.model.decorator.ArCondicionado;
import com.sousadiin.model.decorator.BancoCouro;
import com.sousadiin.model.decorator.DirecaoHidraulica;
import com.sousadiin.model.decorator.RodaLigaLeve;

/**
 *
 * @author Wildes Sousa
 */
public class Aplication {
    public static void main(String[] args) throws Exception {
        Veiculo pas = new Passeio("Carro passeio");
        gerarRelatorio(pas);
        
        pas = new ArCondicionado(pas);
        gerarRelatorio(pas);
        
        pas = new DirecaoHidraulica(pas);
        gerarRelatorio(pas);
        
        pas = new Esportivo("BMW");
        gerarRelatorio(pas);
        pas = new RodaLigaLeve(20, pas);
        gerarRelatorio(pas);
        pas = new ArCondicionado(pas);
        gerarRelatorio(pas);
        
        pas = new DirecaoHidraulica(pas);
        gerarRelatorio(pas);
        
        pas = new BancoCouro(pas);
        gerarRelatorio(pas);
        
    }
    public static void gerarRelatorio(Veiculo v){
        System.out.println("Tipo do veiculo: " + v.getDescricao() + "\tPreço: " + v.preco()+"\n");
    }
}
