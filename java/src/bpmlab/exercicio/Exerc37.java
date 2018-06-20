/*
37. Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar somente valores
positivos. Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, sendo que
o segundo valor (B), deverá ser maior que o primeiro (A), caso contrário, digitar novamente somente o
segundo. Após a validação dos dados, exibir a tabuada do valor digitado, no intervalo decrescente, ou
seja, a tabuada de X no intervalo de B para A.
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc37 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a = 0;
        int x = 0;
        while (x <= 1) {
            System.out.println("Digite um numero positivo");
            System.out.print(">>");
            x = entrada.nextInt();

        }
        while (a <= 1) {
            System.out.println("Digite um numero positivo para A");
            System.out.print(">>");
            a = entrada.nextInt();

        }
        int b = a;
        while (b <= a) {
            System.out.println("Digite um numero positivo para B");
            System.out.print(">>");
            b = entrada.nextInt();

        }

        for (int i = b; i >= a; i--) {
            int c = x * i;
            System.out.println(x + " x " + i + " = " + c);
        }
    }

}
