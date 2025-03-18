package pratica1interface.pratica2;

public class MainAbstracao {
    public static void main(String[] args) throws Exception {
        Pessoa5 professor = new Professor3("pedro", 40, 10000);
        professor.fazerAniversario(); //pedro agora tem 41 anos e nenhuma mensagem é impressa
        professor.fazerAdmissao(); //será impressa a mensagem "Olá, professor(a): Seu salário será de 10000"

        Pessoa5 aluno = new Aluno3("Lucas", 11, "5ª ano");
        aluno.fazerAniversario(); //lucas agora tem 12 ano e uma mensagem será impressa
        aluno.fazerAdmissao(); //será impressa a mensagem "Peça a seus pais para fazerem sua mátricula na secretaria"
        //aluno.estudar();
    }
}
