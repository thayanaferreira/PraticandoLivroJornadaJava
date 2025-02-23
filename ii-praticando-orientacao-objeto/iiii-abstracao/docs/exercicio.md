# Exercícios sobre Interfaces em Java

## 📝 Nível 1: Básico

### 1️⃣ Criando e implementando uma interface
Crie uma interface chamada `Veiculo` com os métodos `acelerar()` e `frear()`.  
Depois, crie uma classe `Carro` que **implemente** essa interface e forneça implementações para os métodos.

**Dica:**
```java
public interface Veiculo {
    void acelerar();
    void frear();
}
```

---

### 2️⃣ Várias classes implementando a mesma interface
Usando a interface `Veiculo` do exercício anterior, crie uma **segunda classe** chamada `Moto` que também implemente essa interface.

Teste no `main()` chamando `acelerar()` e `frear()` para um `Carro` e uma `Moto`.

---

## 🔹 Nível 2: Intermediário

### 3️⃣ Métodos `default` e `static`
Altere a interface `Veiculo` e adicione um método `default` chamado `buzinar()` que imprime `"Bii Bii!"`.

Agora, crie um `static boolean ehMotorizado()` que **sempre retorna `true`**.

**Dica:**
```java
default void buzinar() {
    System.out.println("Bii Bii!");
}

static boolean ehMotorizado() {
    return true;
}
```

Teste no `main()` e veja o comportamento.

---

### 4️⃣ Interface com múltiplas implementações
Crie **duas interfaces**:
- `Eletronico` com um método `ligar()`.
- `Conectavel` com um método `conectarWiFi()`.

Agora, crie uma classe `Smartphone` que **implemente ambas as interfaces**.  
No `main()`, crie um objeto `Smartphone` e chame ambos os métodos.

---

## 🔹 Nível 3: Avançado

### 5️⃣ Resolvendo Conflito entre métodos `default`
Crie duas interfaces:
- `Aparelho` com um método `default desligar()`.
- `Dispositivo` com um método `default desligar()` (com outra mensagem).

Agora, crie uma classe `Tablet` que **implementa ambas as interfaces**.  
🛑 O código vai gerar erro! Para resolver, **sobrescreva o método `desligar()` em `Tablet`** e escolha qual comportamento usar.

---

### 6️⃣ Polimorfismo com interfaces
Crie uma interface `Animal` com o método `emitirSom()`.  
Agora, crie as classes `Cachorro` e `Gato` que **implementam** essa interface.

No `main()`, crie um **array de `Animal`** e coloque um `Cachorro` e um `Gato`.  
Percorra o array e chame `emitirSom()` para cada um.

**Dica:**
```java
Animal[] animais = {new Cachorro(), new Gato()};
for (Animal a : animais) {
    a.emitirSom();
}
```

Isso demonstra **polimorfismo**, pois diferentes classes (`Cachorro` e `Gato`) têm implementações diferentes do mesmo método.

---

Esses exercícios vão te ajudar a **fixar bem o conceito de interfaces** e entender como elas funcionam na prática. Se precisar de explicação ou quiser ver a resposta de algum, só avisar! 🚀😃
