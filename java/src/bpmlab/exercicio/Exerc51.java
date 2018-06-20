package bpmlab.exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exerc51 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int opt, num1, num2;
        float result;
        do {
            System.out.println("1– Triângulo");
            System.out.println("2– Quadrado");
            System.out.println("3– Retangulo");
            System.out.println("4– Circulo");
            System.out.println("5– Fim de processo");
            opt = ler.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("CALCULAR AREA DO TRIANGULO\n");
                    System.out.print("Base: ");
                    num1 = ler.nextInt();
                    System.out.print("Altura: ");
                    num2 = ler.nextInt();
                    result = num1 * num2 / 2;
                    System.out.print("\nResultado: " + result);
                    break;

                case 2:
                    System.out.print("CALCULAR AREA DO QUADRADO\n");
                    System.out.print("Aresta: ");
                    num1 = ler.nextInt();
                    result = (int) Math.pow(num1, 2);
                    System.out.print("\nResultado: " + result);
                    break;

                case 3:
                    System.out.print("CALCULAR AREA DO RETANGULO\n");
                    System.out.print("Base: ");
                    num1 = ler.nextInt();
                    System.out.print("Altura: ");
                    num2 = ler.nextInt();
                    result = num1 * num2;
                    System.out.print("\nResultado: " + result);
                    break;

                case 4:
                    System.out.print("CALCULAR AREA DO CIRCULO\n");
                    System.out.print("Raio do circulo: ");
                    num1 = ler.nextInt();
                    result = (float) ((float) Math.PI * (Math.pow(num1, 2)));
                    System.out.printf("\nResultado: %.2f", result);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Opcao invalida");
            }
        } while ((opt < 1) || (opt > 5));
    }
}
