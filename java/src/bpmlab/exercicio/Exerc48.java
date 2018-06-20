package bpmlab.exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exerc48 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int i, fatorial = 1;
        int num = 0, qtde;
        String resp;
        boolean test = false;
        do {

            do {

                System.out.print("Entre com um valor positivo: ");
                num = ler.nextInt();
                qtde = num - 1;
                if (num >= 0) {
                    for (i = 0; i < num; i++) {
                        fatorial *= (num - qtde);
                        qtde--;
                    }
                } else {
                    System.out.println("\nErro. Digite novamente\n");
                }

            } while (num < 0);

            System.out.print("\nResultado: " + fatorial);
            System.out.print("\n\nDeseja rodar o programa novamente [S/N]? ");
            resp = ler.next();
            test = resp.equalsIgnoreCase("s");
            fatorial = 1;
        } while (test == true);

    }
}
