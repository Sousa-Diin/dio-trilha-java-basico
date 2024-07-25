
import com.soluttep.facade.Facade;
import com.soluttep.singleton.SingletonLazy;
import com.soluttep.strategy.Comportamento;
import com.soluttep.strategy.ComportamentoAgressivo;
import com.soluttep.strategy.ComportamentoDefensivo;
import com.soluttep.strategy.ComportamentoNormal;
import com.soluttep.strategy.Robo;


public class App {
    public static void main(String[] args) throws Exception {

        //Singleton
        System.out.println("Hello, World!");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo iroMan = new Robo();
        iroMan.setComportamneto(defensivo);
        iroMan.mover();

        // Facade
        
        Facade facade = new Facade();
        facade.migrarClient("wildes", "3720000");
    }
}
