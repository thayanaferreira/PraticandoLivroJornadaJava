package exercicio5;

public interface IAparelho {

    default void desligar(){
        //método default pode ter implementação na interface e ser sobrescrito na classe.
        System.out.println("método desligar() da interface Aparelho");
    }

}
