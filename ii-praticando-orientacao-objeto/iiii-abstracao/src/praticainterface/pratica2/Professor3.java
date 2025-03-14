package praticainterface.pratica2;

public class Professor3 extends Pessoa5 {
    private double salario;

    public Professor3(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //implementando o método abstrato
    public void fazerAdmissao(){
        System.out.println("Olá, professor(a): Seu salário será de " +salario);
    }
}
