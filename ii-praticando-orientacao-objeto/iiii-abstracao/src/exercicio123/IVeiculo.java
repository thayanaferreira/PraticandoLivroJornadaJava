package exercicio123;

public interface IVeiculo {
    //métodos abstratos, devem ser obrigatoriamente implementados na classe.
    //é ímplicito que é um método abstrato é público
    void acelerar();  
    void frear();    

    //método defaut, pode ser sobrescrito na classe.
    default void businar(){
        System.out.println("Bii Bii!");
    }

    //método static, chamado diretamente pela interface
    static boolean ehMotorizado(){
        return true;
    }
}
