import java.time.LocalDate;

public class mainPessoa {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa(LocalDate.of(1992, 9, 1), 1.68f, "Divorciada", "F");
        pessoa.exibeIdade();
    }
}