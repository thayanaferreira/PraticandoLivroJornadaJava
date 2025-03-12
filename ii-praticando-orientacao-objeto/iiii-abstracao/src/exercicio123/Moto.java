package exercicio123;

public class Moto implements IVeiculo{
    public void acelerar(){
        System.out.println("A moto está acelerando...");
    }

    public void frear(){
        System.out.println("A moto está freando...");
    }

    @Override
    public void businar(){
        System.out.println("Biiiiiiiiii!");
    }
}
