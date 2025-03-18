package pratica1metodoEstatico;

public class NumeroUtils {
    /*
    //forma que vimos até agora, onde seria necessário instanciar a classe pratica1.NumeroUtils para usar o método comparaDoisInts.
    public void comparaDoisInts(int int1, int int2) {
    if (int1 == int2) {
            System.out.println("Os números são iguais.");
        } else if (int1 > int2) {
            System.out.println("O primeiro número é maior.");
        } else if (int1 < int2) {
            System.out.println("O segundo número é maior.");
        }
    }
    */

    //declarando o método como estático:
    public static void comparaDoisInts(int int1, int int2) {
        if (int1 == int2) {
            System.out.println("Os números são iguais.");
        } else if (int1 > int2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }
    }
}
