package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc42 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int i, count = 1, num;
        boolean par;
        int result[] = new int[100];

        do {
            System.out.print("Entre com o valor positivo: ");
            num = ler.nextInt();

            if ((num < 100) && (num > 0)) {
                for (i = 1; i <= num; i++) {
                    if (i < 2) {
                        result[i] = i + count;
                        System.out.print(result[i] + ", ");
                        count += 2;
                    } else {
                        result[i] = result[(i - 1)] + count;
                        System.out.print(result[i] + ", ");
                        count += 2;
                    }
                }
            } else {
                System.out.println("\nErro. Digite o valor novamente.");
            }
        } while ((num < 0) || (num >= 100));
    }
}
