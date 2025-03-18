abstract class Veiculo {
    abstract void acelerar();
}

public class Pratica2classeAnonimaComClasseAbstrata {
    public static void main(String[] args) {
        // Criando uma classe anônima que estende a classe abstrata Veiculo
        Veiculo carro = new Veiculo() {
            @Override
            void acelerar() {
                System.out.println("O carro está acelerando!");
            }
        };

        carro.acelerar(); // Saída: O carro está acelerando!
    }
}
