package exercicio5;

public class Tablet implements IAparelho, IDispositivo{
    
    public void desligar(){
        System.out.println("método desligar sobrescrito na classe.");
        /*  aqui eu sobrescrevi o método e parou de dar o erro:
            Duplicate default methods named desligar with the parameters () and () are inherited from the types IDispositivo and IAparelho */
    }
}
