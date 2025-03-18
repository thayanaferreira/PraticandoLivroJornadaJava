package pratica1interface.pratica1;


public interface IEletronico {
    
    // metodo abstratos
    void ligar();

    // método padrão/método concreto
    default void desligar(){
        System.out.println("Desligando o eletrônico,");
    }

    // método static 
    static boolean ehEletronico(){
        return true;
    }

}
