package exercicio2;

public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo;
        
        veiculo = new Carro();
        veiculo.mover();

        veiculo = new Bicicleta();
        veiculo.mover();
    }
}

/* 
@Override não é obrigatório, mas é um ótimo ajudante, pois se ao subscrevermos o 
método, escrevermos o nome do método errado, ou se esquecermos extends' a classe, 
o compilador nos sinalizará com um erro.
*/