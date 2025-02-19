import java.time.LocalDate;

public class mainPessoa {
    public static void main(String[] args){
        Pessoa1 pessoa = new Pessoa1(LocalDate.of(1992, 9, 1), 1.68f, "Divorciada", "F");
        pessoa.exibeIdade();
    }
}
