package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc52 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um numero: ");

            num[i] = ler.nextInt();

        }
        System.out.println("Valores Armazenados...");

        for (int j = num.length; j > 0; j--) {

            System.out.print(num[j - 1] + " ");
        }
        System.out.println("");
    }
}
