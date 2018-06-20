package bpmlab.exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exerc47 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int i, n, soma = 0, maior = 0, qtde, menor = 0;
        int total = 0;
        int num = 0;
        float media = 0, percentPos = 0, percentNeg = 0;
        String resp;
        boolean test = false;
        do {
            System.out.print("Quantidade de valores: ");
            qtde = ler.nextInt();

            for (i = 0; i < qtde; i++) {
                do {

                    System.out.print("Entre com um valor positivo: ");
                    num = ler.nextInt();
                    if (i == 0) {
                        menor = num;
                    }

                    if (num >= 0) {
                        soma += num;
                        maior = Math.max(num, maior);
                        menor = Math.min(num, menor);
                        percentPos++;
                    } else if (num < 0) {
                        percentNeg++;
                    }

                } while (num < 0);
            }
            total = (int) (percentPos + percentNeg);
            media = soma / percentPos;
            percentPos = (percentPos * 100) / total;
            percentNeg = (percentNeg * 100) / total;
            System.out.println("Maior Valor: " + maior);
            System.out.println("Menor Valor: " + menor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Media aritmetica dos valores: " + media);
            System.out.printf("Porcentagem dos valores positivos: %.2f",
                    percentPos);
            System.out.printf("\nPorcentagem dos valores negativos: %.2f",
                    percentNeg);

            System.out.print("\n\nDeseja rodar o programa novamente [S/N]? ");
            resp = ler.next();
            test = resp.equalsIgnoreCase("s");

        } while (test == true);

    }
}
