# Respostas extraídas do chatGPT  

### Exercício 1 e 2: Interface Veiculo e implementações Carro e Moto

```java

// Exercício 1 e 2: Interface Veiculo e implementações Carro e Moto
public interface Veiculo {
void acelerar();
void frear();
}

class Carro implements Veiculo {
@Override
public void acelerar() {
System.out.println("Carro acelerando...");
}

    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }
}

class Moto implements Veiculo {
@Override
public void acelerar() {
System.out.println("Moto acelerando...");
}

    @Override
    public void frear() {
        System.out.println("Moto freando...");
    }
}
```
### Exercício 3: Métodos default e static na interface Veiculo  

```java
interface VeiculoAvancado extends Veiculo {
default void buzinar() {
System.out.println("Bii Bii!");
}

    static boolean ehMotorizado() {
        return true;
    }
}

// Exercício 4: Implementação de múltiplas interfaces
interface Eletronico {
void ligar();
}

interface Conectavel {
void conectarWiFi();
}

class Smartphone implements Eletronico, Conectavel {
@Override
public void ligar() {
System.out.println("Smartphone ligado.");
}

    @Override
    public void conectarWiFi() {
        System.out.println("Smartphone conectado ao WiFi.");
    }
}
```
### Exercício 5: Resolvendo conflito entre métodos default
```java
interface Aparelho {
default void desligar() {
System.out.println("Aparelho desligado.");
}
}

interface Dispositivo {
default void desligar() {
System.out.println("Dispositivo desligado.");
}
}

class Tablet implements Aparelho, Dispositivo {
@Override
public void desligar() {
System.out.println("Tablet desligado pelo método escolhido.");
}
}

// Exercício 6: Polimorfismo com interfaces
interface Animal {
void emitirSom();
}

class Cachorro implements Animal {
@Override
public void emitirSom() {
System.out.println("Au Au!");
}
}

class Gato implements Animal {
@Override
public void emitirSom() {
System.out.println("Miau!");
}
}
```
### Exercício 7: Enum Mes com número de dias
```java
enum Mes {
JANEIRO(31), FEVEREIRO(28), MARCO(31), ABRIL(30), MAIO(31), JUNHO(30),
JULHO(31), AGOSTO(31), SETEMBRO(30), OUTUBRO(31), NOVEMBRO(30), DEZEMBRO(31);

    private final int dias;
    Mes(int dias) { this.dias = dias; }
    public int getDias() { return dias; }
}
```

### Exercício 8: Enum Naipe com cor correspondente

```java
enum Naipe {
COPAS("Vermelho"), OUROS("Vermelho"), ESPADAS("Preto"), PAUS("Preto");

    private final String cor;
    Naipe(String cor) { this.cor = cor; }
    public String getCor() { return cor; }
}
```

## Exercício 9: Enum OperacaoMatematica com cálculos

```java
enum OperacaoMatematica {
SOMA {
@Override
public double calcular(double a, double b) { return a + b; }
},
SUBTRACAO {
@Override
public double calcular(double a, double b) { return a - b; }
},
MULTIPLICACAO {
@Override
public double calcular(double a, double b) { return a * b; }
},
DIVISAO {
@Override
public double calcular(double a, double b) { return a / b; }
};

    public abstract double calcular(double a, double b);
}
```
### Exercício 10: Enum StatusConta com mensagens descritivas
```java
enum StatusConta {
ATIVA("Conta ativa e operacional."),
BLOQUEADA("Conta bloqueada por segurança."),
CANCELADA("Conta cancelada permanentemente.");

    private final String mensagem;
    StatusConta(String mensagem) { this.mensagem = mensagem; }
    public String getMensagem() { return mensagem; }
}
```

### Main para testar os exercícios
```java
public class Main {
public static void main(String[] args) {
Carro carro = new Carro();
Moto moto = new Moto();
carro.acelerar();
carro.frear();
moto.acelerar();
moto.frear();

        VeiculoAvancado veiculo = new Carro();
        veiculo.buzinar();
        System.out.println("É motorizado? " + VeiculoAvancado.ehMotorizado());
        
        Smartphone smartphone = new Smartphone();
        smartphone.ligar();
        smartphone.conectarWiFi();
        
        Tablet tablet = new Tablet();
        tablet.desligar();
        
        Animal[] animais = {new Cachorro(), new Gato()};
        for (Animal a : animais) {
            a.emitirSom();
        }
        
        System.out.println("Fevereiro tem " + Mes.FEVEREIRO.getDias() + " dias.");
        System.out.println("O naipe de Copas é da cor " + Naipe.COPAS.getCor() + ".");
        System.out.println("Resultado da soma: " + OperacaoMatematica.SOMA.calcular(5, 3));
        System.out.println("Status da conta: " + StatusConta.ATIVA.getMensagem());
    }
}
```