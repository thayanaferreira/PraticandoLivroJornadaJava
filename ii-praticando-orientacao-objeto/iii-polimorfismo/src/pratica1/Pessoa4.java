package pratica1;

public class Pessoa4 {
    protected String nome;
    protected int idade;

    public Pessoa4(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void fazerAniversario(){
        idade++;
    }
}
