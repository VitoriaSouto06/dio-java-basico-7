import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
      //Singleton
       SingletonLazy lazy = SingletonLazy.getInstancia();
       System.out.println(lazy);
       SingletonEager eager = SingletonEager.getInstancia();
       System.out.println(eager);
       SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
       System.out.println(holder);


       //Strategy
       Comportamento defensivo = new ComportamentoDefensivo();
       Comportamento normal = new ComportamentoNormal();
       Comportamento agressivo = new ComportamentoAgressivo();

       Robo robo = new Robo();
       robo.setComportamento(normal);
       robo.mover();
       robo.setComportamento(agressivo);
       robo.mover();
       robo.setComportamento(defensivo);
       robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Vitoria", "8888888");
    }
}
