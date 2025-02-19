package praticapessoal;

public class Aluno extends Pessoa {

    private String serie;

    public Aluno(String nome, int idade, String serie) {
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
