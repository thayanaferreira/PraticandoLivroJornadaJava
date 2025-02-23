public class Professor extends Pessoa3 {

    //declarar nome idade salario
    private double salario;

    //contrutor 
    //declara o construtor normalmente, so muda dentro do contrutor, oque for atributo da super classe...
    //...sinalizamos apenas assim: super(nome, idade).
    //o comando super sempre deve vir na primeira linha, pois primeiro o contrutor da superclasse é executado e depois o contrutor da sub.
    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    //get e set
    public double getSalario(){
        return salario;
    } 

    public void setSalario(double salario){
        this.salario = salario;
    }
}
