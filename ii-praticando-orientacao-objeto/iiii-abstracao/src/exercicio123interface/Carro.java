package exercicio123interface;

public class Carro implements IVeiculo{
    public void acelerar(){
        System.out.println("o carro está acelerando...");
    }

    public void frear(){
        System.out.println("o carro está freando...");
    }
}
