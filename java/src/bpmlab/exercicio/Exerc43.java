package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc43 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, i, j = 2;
        float result;

        do {
            System.out.print("Insira o numero: ");
            n = ler.nextInt();

            if ((n < 50) && ((n % 2) == 0)) {
                for (i = 1; i <= n; i++) {
                    result = i / j;
                    System.out.printf("%d/%d = %f\n", i, j, result);
                    j++;
                }
            }

        } while ((n >= 50) || ((n % 2) != 0));

    }
}
