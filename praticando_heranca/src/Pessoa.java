public class Pessoa {
    protected String nome;
    protected int idade;

    //construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //getters e settets
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

    //metodo sem retorno fazerAniversario
    public void fazerAniversario(){
        idade++;
    }
}
