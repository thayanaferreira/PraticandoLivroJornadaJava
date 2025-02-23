package exercicio1;

public interface IVeiculo {
    //métodos abstratos, deve ser implementado na classe.
    //é ímplicito que é um método abstrato público
    void acelerar();  
    void frear();    

    //método defaut, pode ser sobrescrito.
    default void businar(){
        System.out.println("Bii Bii!");
    }

    //método static, chamado diretamente pela interface
    static boolean ehMotorizado(){
        return true;
    }
}
