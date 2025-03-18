package pratica2enum.exercicio9enum;

import java.util.Scanner;

public class MainOperacaoMatematica {
    public static void main(String[] args) {
        int resultado=0;
        int num1=0;
        int num2=0;

        Scanner scanner = new Scanner(System.in);

        //soma
        System.out.println("-------------------------------------------");
        System.out.println("Digite o primeiro número da soma:");
        num1=scanner.nextInt();
        System.out.println("Digite o segundo número da soma:");
        num2=scanner.nextInt();
        resultado = OperacaoMatematica.SOMA.fazCalculo(num1, num2);
        System.out.println(num1 + String.valueOf(OperacaoMatematica.SOMA.getSimbolo()) + num2 + " = " + resultado);
        System.out.println("-------------------------------------------");

        //subtração
        System.out.println("Digite o primeiro número da subtração:");
        num1=scanner.nextInt();
        System.out.println("Digite o segundo número da subtração:");
        num2=scanner.nextInt();
        resultado = OperacaoMatematica.SUBTRACAO.fazCalculo(num1, num2);
        System.out.println(num1 + String.valueOf(OperacaoMatematica.SUBTRACAO.getSimbolo()) + num2 + " = " + resultado);
        System.out.println("-------------------------------------------");

        //multiplicação
        System.out.println("Digite o primeiro número da multiplicação:");
        num1=scanner.nextInt();
        System.out.println("Digite o segundo número da multiplicação:");
        num2=scanner.nextInt();
        resultado = OperacaoMatematica.MULTIPLICACAO.fazCalculo(num1, num2);
        System.out.println(num1 + String.valueOf(OperacaoMatematica.MULTIPLICACAO.getSimbolo()) + num2 + " = " + resultado);
        System.out.println("-------------------------------------------");

        //multiplicação
        System.out.println("Digite o primeiro número da divisão:");
        num1=scanner.nextInt();
        System.out.println("Digite o segundo número da divisão:");
        num2=scanner.nextInt();
        resultado = OperacaoMatematica.DIVISAO.fazCalculo(num1, num2);
        System.out.println(num1 + String.valueOf(OperacaoMatematica.DIVISAO.getSimbolo()) + num2 + " = " + resultado);
        System.out.println("-------------------------------------------");

        scanner.close();

    }
}
