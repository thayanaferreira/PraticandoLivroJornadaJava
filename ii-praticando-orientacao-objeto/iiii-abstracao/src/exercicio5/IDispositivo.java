package exercicio5;

public interface IDispositivo {
    default void desligar(){
        //método default possui implementação e pode ser sobrescrito na classe.
        System.out.println("método desligar() da interface Dispositivo");
    }
}
