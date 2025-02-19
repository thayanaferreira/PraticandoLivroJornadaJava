package praticapessoal;

public class MainPessoa {
    public static void main(String[] args){
        //praticando o polimorfismo: o método fazerAniversario não existe em aluno e provessor, e mesmo assim foi chamado normalmente...
        //pois aluno/professor É-UMA-PESSOA
        Professor professor = new Professor("Thay", 32, 25000);
        professor.fazerAniversario();
        Aluno aluno = new Aluno("Clarisse", 12, "6ª");
        aluno.fazerAniversario();

        System.out.println("idade professor(a) PÓS niver: " + professor.getIdade());
        System.out.println("idade aluno PÓS niver: " + aluno.getIdade());

        //exemplificando que se tivermos um método que espera receber um objeto do tipo pessoa,
        //ele poderá receber no lugar um objeto do tipo aluno, pelo motivo de: É-UMA-PESSOA
        Escola escola = new Escola();
        escola.cadastrarPessoa(professor); //escola.cadastrarPessoa(Pessoa pessoa);
        System.out.println("Professor cadastrado com sucesso!");
        escola.cadastrarPessoa(aluno);
        System.out.println("Aluno cadastrado com sucesso!");

        //o mesmo raciocinio ocorre para retornos de métodos.
    
    }
}
