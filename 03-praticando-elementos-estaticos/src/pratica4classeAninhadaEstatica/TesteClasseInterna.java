package pratica4classeAninhadaEstatica;

public class TesteClasseInterna {
    public static void main(String[] args) {
        //Criando uma instancia da classe interna
        ClasseExterna.ClasseInternaEstatica ex1 = new ClasseExterna.ClasseInternaEstatica();

        //Para criar uma instancia da ClasseInterna, é necessario criar uma instancia da ClasseExterna
        ClasseExterna ex2 = new ClasseExterna();
        ClasseExterna.ClasseInternaNaoEstatica ex3 = ex2.new ClasseInternaNaoEstatica();

        //Outra forma de criar uma instancia da InnerClass
        ClasseExterna.ClasseInternaNaoEstatica ex4 = new ClasseExterna().new ClasseInternaNaoEstatica();
    }
}
