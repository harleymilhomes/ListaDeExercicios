package bpmlab.exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exerc53 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[10];
        int maior = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um numero: ");

            num[i] = ler.nextInt();
            maior = Math.max(num[i], maior);
        }
        System.out.println("Valores Armazenados...");

        for (int j = num.length; j > 0; j--) {

            System.out.print(num[j - 1] + " ");
        }
        System.out.println("\nMaior Valor: " + maior);
    }
}
