public class Aluno extends Pessoa3 {

    // declarar nome idade salario
    private String serie;

    // contrutor
    // declara o construtor normalmente, so muda dentro do contrutor, oque for
    // atributo da super classe...
    // ...sinalizamos apenas assim: super(nome, idade).
    // o comando super sempre deve vir na primeira linha, pois primeiro o contrutor
    // da superclasse é executado e depois o contrutor da sub.
    public Aluno(String nome, int idade, String serie) {
        super(nome, idade);
        this.serie = serie;
    }

    // get e set
    public String getSerie() {
        return serie;
    }

    public void setSalario(String serie) {
        this.serie = serie;
    }

    // reescrevendo um metodo da superclasse dentro da boa pratica
    public void fazerAniversario() {
        // setIdade(getIdade()+1);
        // System.out.println("Feliz aniversario querido aluno");

        super.fazerAniversario();
        System.out.println("Feliz aniversario querido aluno");
    }
}
