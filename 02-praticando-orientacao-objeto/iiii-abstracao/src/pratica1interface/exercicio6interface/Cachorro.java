package pratica1interface.exercicio6interface;

public class Cachorro implements IAnimal {
    @Override
    public void emitirSom() {
        System.out.println("o cachorro está emitindo um som");
    }
}
