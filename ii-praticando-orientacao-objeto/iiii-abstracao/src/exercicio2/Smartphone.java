package exercicio2;

public class Smartphone implements IConectavel, IEletronico{
    public void ligar(){
        System.out.println("o smartifone ligou.");
    }

    public void conectarWifi(){
        System.out.println("conexão wifi realizada com sucesso.");
    }
}
