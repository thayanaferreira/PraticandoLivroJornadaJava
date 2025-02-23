package exercicio1;

public class MainAnimal {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.emitirSom();
    }
}

/* 
Qual mensagem será apresentada? E por que?
    R:"Latido..."
    Porque o método emitirSom foi sobrescrito na classe filha(Cachorro), entao o método de Cachorro que é executado.
*/