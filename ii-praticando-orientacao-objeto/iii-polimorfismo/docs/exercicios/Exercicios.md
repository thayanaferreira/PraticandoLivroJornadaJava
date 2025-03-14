


# Exercícios para fixação de conceitos de polimorfismo.  

<br>  

## Exercício 1 - Explorando a Referência e o Tipo Real
O que acontece se rodarmos este código? Qual será a saída?  

```java
Copiar código
class Animal {
    void emitirSom() {
        System.out.println("Som de animal...");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latido!");
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.emitirSom();
    }
}
```
📌 Pergunta: Qual será a saída? Por quê?

<br>  

## Exercício 2 - Criando Sua Própria Hierarquia  

Crie uma hierarquia de classes onde:
1. A classe Veiculo tenha um método mover(), que imprime "O veículo está se  movendo...".  
2. As classes Carro e Bicicleta herdam de Veiculo e sobrescrevem mover().  
3. No main(), crie uma variável Veiculo e atribua a ela objetos de Carro e Bicicleta. Chame mover() e veja o resultado.
4. Utilize @Override nas classes filhas.  

<br>  

## Exercício 3 - Testando Métodos Específicos

📌 Pergunta: Qual será o erro ao rodar este código? Como corrigir?

```java
class Pai {
    void metodoPai() {
        System.out.println("Método da classe Pai");
    }
}

class Filho extends Pai {
    void metodoFilho() {
        System.out.println("Método da classe Filho");
    }
}

public class Teste {
    public static void main(String[] args) {
        Pai obj = new Filho();
        obj.metodoFilho(); // O que acontece aqui?
    }
}
```

<br>

### ✅Respostas localizadas em: docs > respostas




