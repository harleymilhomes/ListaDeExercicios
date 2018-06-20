package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {
        System.out.println("Digite o primeiro valor:");
        System.out.print(">> ");
        Scanner lerValor = new Scanner(System.in);
        int a = lerValor.nextInt();
        System.out.println("Digite o segundo valor:");
        System.out.print(">> ");
        int b = lerValor.nextInt();

        if (a > b) {
            System.out.println("O primeiro valor é o maior: " + a);
        } else if (a == b) {

            System.out.println("os números são idênticos: " + a + " e " + b);
        } else {
            System.out.println("O Segundo valor é o maior: " + b);
        }
    }

}
