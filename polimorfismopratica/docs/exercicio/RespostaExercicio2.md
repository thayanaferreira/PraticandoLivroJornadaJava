#### ****** Resposta exercicio 1 ####******

```java
// Classe base Veiculo
class Veiculo {
    void mover() {
        System.out.println("O veículo está se movendo...");
    }
}

// Classe Carro que herda de Veiculo e sobrescreve o método mover()
class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("O carro está se movendo...");
    }
}

// Classe Bicicleta que herda de Veiculo e sobrescreve o método mover()
class Bicicleta extends Veiculo {
    @Override
    void mover() {
        System.out.println("A bicicleta está se movendo...");
    }
}

// Classe principal para testar a hierarquia
public class Main {
    public static void main(String[] args) {
        // Criando uma variável do tipo Veiculo e atribuindo objetos diferentes
        Veiculo meuVeiculo;

        meuVeiculo = new Carro();
        meuVeiculo.mover(); // Saída: O carro está se movendo...

        meuVeiculo = new Bicicleta();
        meuVeiculo.mover(); // Saída: A bicicleta está se movendo...
    }
}

```