package pratica2variavelEstatica;

public class Teste {
    public static void main(final String[] args){ // final impede que args serja reatribuído, então é desnecessário, mas mantive o código do livro.
        Pessoa p1 = new Pessoa();
        p1.nome = "Tatiana";
        System.out.println(p1.nome + " - " + Pessoa.contador);

        Pessoa p2 = new Pessoa();
        p2.nome = "Arthur";
        System.out.println(p2.nome + " - " + Pessoa.contador);
    }
}
