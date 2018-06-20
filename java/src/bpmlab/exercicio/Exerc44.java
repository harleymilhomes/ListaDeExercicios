package bpmlab.exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exerc44 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int i, j, count = 1, num, countj = 1;
        int result[] = new int[100];
        int result2[] = new int[100];

        do {
            System.out.print("Entre com o valor positivo: ");
            num = ler.nextInt();

            if ((num > 0) && (num < 50)) {
                for (i = 1; i <= num; i++) {
                    if (i < 2) {
                        result[i] = i + count;
                        count += 2;
                    } else {
                        result[i] = result[(i - 1)] + count;
                        count += 2;
                    }
                    System.out.printf("%d/%d = %.2f\n", result[i],
                            (int) (Math.pow(countj, 3)),
                            result[i] / (Math.pow(countj, 3)));
                    countj++;

                }
            } else {
                System.out.println("\nErro. Digite o valor novamente.");
            }
        } while ((num < 0) || (num >= 50));
    }
}
