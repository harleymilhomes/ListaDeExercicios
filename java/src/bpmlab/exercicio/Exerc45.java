package bpmlab.exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exerc45 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int i, soma = 0, maior = 0;
        int num = 0;
        float media = 0;

        for (i = 0; i < 10; i++) {
            do {
                System.out.print("Entre com o valor positivo: ");
                num = ler.nextInt();

                if (num > 0) {
                    soma += num;
                    maior = Math.max(num, maior);
                }

            } while (num < 0);

        }
        media = soma / 10;
        System.out.println("Maior Valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media aritmetica dos valores: " + media);
    }
}
