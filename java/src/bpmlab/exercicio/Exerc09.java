package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc09 {

    public static void main(String[] args) {
        /*
        Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e
        corrente elétrica que serão digitados. Utilize a lei de Ohm.
        V=IxR
        V = Tensão elétrica,  unidade volt (V é a letra que representa a unidade).
        I = Corrente elétrica,  unidade âmpere (A é a letra que representa a unidade).
        R = Resistência elétrica,  unidade Ohm (Ω é a letra grega que representa a unidade).
         */

        System.out.println("Digite o valor da Resistência elétrica:");
        System.out.print(">> ");
        Scanner lerResis = new Scanner(System.in);
        int r = lerResis.nextInt();
        System.out.println("Digite o valor da Corrente elétrica:");
        System.out.print(">> ");
        Scanner lerCorrente = new Scanner(System.in);
        int i = lerCorrente.nextInt();

        int v = i * r;

        System.out.println("O Valor da Tensão elétrica é: " + v);
    }

}
