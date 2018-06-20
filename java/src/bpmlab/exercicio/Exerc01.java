package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc01 {

    //Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
    //int A;
    public static void main(String[] args) {

        System.out.println("Digite o valor da altura do seu Retangulo: ");
        System.out.print(">> ");
        Scanner lerAltura = new Scanner(System.in);
        int h = lerAltura.nextInt();
        System.out.println("Digite o valor da base do seu Retangulo: ");
        System.out.print(">> ");
        Scanner lerBase = new Scanner(System.in);
        int b = lerBase.nextInt();

        float A;
        A = (b * h) / 2;

        System.out.println("Área do Trinagulo Retangulo é igual a: " + A);
    }

}
