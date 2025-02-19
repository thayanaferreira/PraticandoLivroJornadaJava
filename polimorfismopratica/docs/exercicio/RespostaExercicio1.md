#### ****** Resposta exercicio 1 ******

### Saída esperada no console:
Latido!

### Por que o método emitirSom() da classe Cachorro foi chamado?
Mesmo que a variável meuAnimal seja do tipo Animal, o objeto real instanciado é um Cachorro.

Em Java, quando um método é sobrescrito (@Override) na subclasse, o método chamado sempre será o da subclasse, desde que ele tenha sido definido corretamente.

Isso acontece por causa do conceito de ligação dinâmica (dynamic method dispatch), que significa que o método executado é determinado em tempo de execução, e não em tempo de compilação.


