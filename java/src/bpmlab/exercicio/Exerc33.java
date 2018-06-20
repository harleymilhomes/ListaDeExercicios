/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc33 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        System.out.print(">> ");
        int a = entrada.nextInt();

        int b = a;
        while (b <= a) {
            System.out.println("Digite o segundo numero");
            System.out.print(">> ");
            b = entrada.nextInt();

        }
        System.out.println("VALOR a: " + a + " valor b: " + b);
    }
}
