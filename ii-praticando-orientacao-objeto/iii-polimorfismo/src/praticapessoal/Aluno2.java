package praticapessoal;

public class Aluno2 extends Pessoa4 {

    private String serie;

    public Aluno2(String nome, int idade, String serie) {
        super(nome, idade);
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSalario(String serie) {
        this.serie = serie;
    }
}
