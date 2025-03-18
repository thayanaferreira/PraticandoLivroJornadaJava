package pratica1metodoEstatico;//Até agora vimos que os métodos são chamados através do objeto:

//classe pratica1.Aluno
public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void matricular() {
        System.out.println("pratica1.Aluno(a) " + nome + "matriculado(a) com sucesso!");
    }

    //seria a classe main
    public class Universidade {
        public static void main(String[] args) {
            Aluno alunaTatiana = new Aluno("Tatiana Escovedo");
            alunaTatiana.matricular();
        }
    }
}
