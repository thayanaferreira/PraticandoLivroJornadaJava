package pratica1;

public class Professor2 extends Pessoa4 {

    private double salario;

    public Professor2(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }  

    public double getSalario(){
        return salario;
    } 

    public void setSalario(double salario){
        this.salario = salario;
    }
}
