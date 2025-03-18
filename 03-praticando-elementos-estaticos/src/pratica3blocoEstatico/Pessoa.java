package pratica3blocoEstatico;

public class Pessoa {
    static {
        System.out.println("Bloco estático");
    }

    public Pessoa(){
        System.out.println("Nova pessoa");
    }
}
