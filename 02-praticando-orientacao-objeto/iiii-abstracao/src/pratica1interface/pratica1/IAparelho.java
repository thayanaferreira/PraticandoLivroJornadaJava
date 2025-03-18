package pratica1interface.pratica1;


public interface IAparelho {
    //método padrão
    default void desligar(){
        System.out.println("Desligando o aparelho");
    }
}
