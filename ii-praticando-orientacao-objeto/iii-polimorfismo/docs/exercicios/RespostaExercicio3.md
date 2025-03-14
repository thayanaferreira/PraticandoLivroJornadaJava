#### 1. O que acontece na linha 20? ####
Erro exibido pelo compilador:
```pgsql
The method metodoFilho() is undefined for the type Pai
```

**Explicação:**  
A variável obj tem o tipo de referência Pai, então, para o compilador, obj só pode chamar os métodos declarados na classe Pai. O método metodoFilho() pertence apenas à classe Filho, e como ele não foi sobrescrito na classe Pai, ele não é visível quando utilizamos uma variável do tipo Pai.
Ou seja, mesmo que obj esteja armazenando uma instância de Filho, o compilador só permite chamar métodos definidos na classe Pai.

#### 2. O que precisa ser feito para corrigir? ####
Aqui há duas formas principais de corrigir o problema:

**Opção 1: Sobrescrever o método**  
Se a intenção é que metodoFilho() seja chamado independentemente do tipo da referência, o correto seria sobrescrever um método já existente em Pai, garantindo que ele possa ser acessado através de uma variável Pai. O código ficaria assim:
```java
class Pai {
    void metodo() {
        System.out.println("Método da classe Pai");
    }
}

class Filho extends Pai {
    @Override
    void metodo() {
        System.out.println("Método da classe Filho");
    }
}

public class Teste {
    public static void main(String[] args) {
        Pai obj = new Filho();
        obj.metodo(); // Agora chamará o método da classe Filho devido ao polimorfismo.
    }
}
```
Aqui, metodo() foi sobrescrito e pode ser chamado por obj sem problemas.

**Opção 2: Fazer um casting para acessar metodoFilho()**  
Se o objetivo é acessar um método específico da classe Filho, a variável precisa ser convertida para Filho explicitamente:

```java
public class Teste {
    public static void main(String[] args) {
        Pai obj = new Filho();
        ((Filho) obj).metodoFilho(); // Agora funciona
    }
}
```
Mas isso só funciona se tivermos certeza de que obj é, de fato, uma instância de Filho. Caso contrário, isso pode causar um erro em tempo de execução (ClassCastException).
