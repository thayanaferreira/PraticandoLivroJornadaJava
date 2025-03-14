package exercicio123interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();
        //carro.businar();
        //System.out.println("O veiculo é motorizado? " + IVeiculo.ehMotorizado());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Moto moto = new Moto();
        moto.acelerar();
        moto.frear();
        //moto.businar();
        //System.out.println("O veiculo é motorizado? " + IVeiculo.ehMotorizado());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
