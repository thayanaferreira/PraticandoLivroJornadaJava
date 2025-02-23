package praticando.pratica2;

public abstract class Pessoa5{
    protected String nome;
    protected int idade;

    public Pessoa5(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //método concreto
    public void fazerAniversario(){
        idade++;
    }
    
    //método abstrato
    public abstract void fazerAdmissao();
}
