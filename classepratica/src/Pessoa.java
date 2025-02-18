import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    // atibutos da minha classe
    LocalDate dataNascimento;
    float altura;
    String estadoCivil;
    String genero;

    // construtor 
        // quando dou new - para criar um novo objeto - é chamado o construtor da classe
    public Pessoa(LocalDate dataNascimento, float altura, String estadoCivil, String genero){
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
    }

    //metodo para exibir a idade apartir da data de nascimento
    public void exibeIdade(){
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(dataNascimento, hoje).getYears();
        System.out.println(idade);

    }

}
