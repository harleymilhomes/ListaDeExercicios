package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {
        //A partir dos valores da base e altura de um triângulo, calcular e exibir sua área
        //A = (b x h)/2
        System.out.println("Digite o valor da base do seu Triangulo:");
        System.out.print(">> ");
        Scanner lerBase = new Scanner(System.in);
        int b = lerBase.nextInt();
        System.out.println("Digite o valor da Altura do seu Triangulo:");
        System.out.print(">> ");
        Scanner lerAltura = new Scanner(System.in);
        int h = lerAltura.nextInt();
        //como eu estava sem a bibliotea Math usei o principio de que d² é o mesmo que dxd
        float A = (b * h) / 2;
        System.out.println("A área do seu Triangulo é igual: " + A);
    }

}
