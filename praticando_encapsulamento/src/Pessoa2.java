public class Pessoa2 {
    String nome;
    private int idade;

    //construtor
    public Pessoa2(String nome){
        idade = 0;
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade>=0){
            this.idade = idade;
        }
    }

    public int getIdade(){
        return idade;
    }

    public void fazerAniversario(){
        idade++;
    }

}
