package praticapessoal;

public class MainPessoa {
    public static void main(String[] args){
        double salario;
        String quebraDeLinha = "";
        //praticando o polimorfismo: o método fazerAniversario não existe em aluno e provessor, e mesmo assim foi chamado normalmente...
        //pois aluno/professor É-UMA-PESSOA
        Pessoa4 professor = new Professor2("Thay", 32, 25000);
        professor.fazerAniversario();
        System.out.println("idade professor(a) PÓS niver: " + professor.getIdade());
        salario = ((Professor2) professor).getSalario(); //feito casting aqui, pois o getSalario é um metodo somente de professor.
        System.out.println("O salário do professor é: " +salario);
        
        System.out.println(quebraDeLinha);

        Pessoa4 aluno = new Aluno2("Clarisse", 12, "6ª");
        aluno.fazerAniversario();
        System.out.println("idade aluno PÓS niver: " + aluno.getIdade());

        System.out.println(quebraDeLinha);

        /*exemplificando abaixo que se tivermos um método que espera receber um objeto do tipo pessoa,
        ele poderá receber no lugar um objeto do tipo aluno, pelo motivo de: É-UMA-PESSOA
        o mesmo raciocinio ocorre para retornos de métodos.*/
        Escola escola = new Escola();
        escola.cadastrarPessoa(professor); //escola.cadastrarPessoa(Pessoa pessoa);
        System.out.println("Professor cadastrado com sucesso!");
        escola.cadastrarPessoa(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }
}
