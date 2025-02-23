package praticando.pratica1;

public class Computador implements IEletronico, IAparelho {
    // implementando o método abstrato da interface

    public void ligar() {
        System.out.println("Ligando computador");
    }

    public void desligar(){
        System.out.println("Desligando o computador");
    }

}
