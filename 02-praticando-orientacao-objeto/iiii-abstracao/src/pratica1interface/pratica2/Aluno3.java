package pratica1interface.pratica2;

public class Aluno3 extends Pessoa5{
    private String serie;

    public Aluno3(String nome, int idade, String serie){
        super(nome, idade);
        this.serie = serie;
    }

    public String getSerie(){
        return serie;
    }

    public void setSerie(String serie){
        this.serie = serie;
    }

    @Override
    public void fazerAniversario(){
        super.fazerAniversario();
        System.out.println("Feliz aniversário, querido(a) aluno(a)!");
    }

    public void fazerAdmissao(){
        System.out.println("Peça a seus pais para fazerem sua mátricula na secretaria");
    }   

    //declarando um novo método concreto
    public void estudar(){
        System.out.println("Estude muito");
    }
}
