interface Animal {
    void fazerSom();
}

public class Pratica1classeAnonicaComInterface {
    public static void main(String[] args) {
        // Criando uma classe anônima que implementa a interface Animal
        Animal gato = new Animal() {
            @Override
            public void fazerSom() {
                System.out.println("Miau!");
            }
        };

        gato.fazerSom(); // Saída: Miau!
    }
}