package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc24 {

    public static void main(String[] args) {
        System.out.println("Digite o primeiro valor:");
        System.out.print(">> ");
        Scanner lerValor = new Scanner(System.in);
        int a = lerValor.nextInt();
        System.out.println("Digite o segundo valor:");
        System.out.print(">> ");
        int b = lerValor.nextInt();
        System.out.println("Digite o segundo valor:");
        System.out.print(">> ");
        int c = lerValor.nextInt();

        if (a > b && a > c) {
            System.out.println("O primeiro valor é o maior: " + a);
        } else if (b > a && b > c) {

            System.out.println("O segundo valor é o maior: " + b);
        } else {
            System.out.println("O terceiro valor é o maior: " + c);
        }
    }

}
