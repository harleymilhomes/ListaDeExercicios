package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc55 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[20];
        int[] num2 = new int[20];

        //int maior = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um numero: ");

            num[i] = ler.nextInt();
            //maior = Math.max(num[i], maior);            
        }
        System.out.print("digite uma constante para multiplicar: ");
        int mult = ler.nextInt();

        for (int i = 0; i < num.length; i++) {
            num2[i] = num[i] * mult;

        }

        System.out.println("\nValores Armazenados...");

        for (int j = 0; j < num.length; j++) {

            System.out.print(num[j] + " ");
        }
        //System.out.println("\nMaior Valor: " + maior);
        System.out.println("\n\nValores Armazenados Multiplicados...");
        for (int j = 0; j < num2.length; j++) {

            System.out.print(num2[j] + " ");
        }
    }
}
