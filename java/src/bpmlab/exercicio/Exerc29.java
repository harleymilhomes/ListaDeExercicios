/*
A partir dos valores da aceleração (a em m/s2), da velocidade inicial (v0 em m/s) e do tempo de percurso
(t em s). Calcular e exibir a velocidade final de automóvel em km/h. Exibir mensagem de acordo com a
tabela:
 */
package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc29 {

    public static void main(String[] args) {

        //velocidade inicial (em m/s)
        System.out.println("Digite a velocidade inical em m/s");
        System.out.print(">> ");
        Scanner lerValor = new Scanner(System.in);
        int velIni = lerValor.nextInt();
        //Aceleração (m/s2)
        System.out.println("Digite a aceleração em  m/s²");
        System.out.print(">> ");
        new Scanner(System.in);
        int acel = lerValor.nextInt();
        //tempo de percurso (em s).
        System.out.println("Digite o tempo de percurso em segundos");
        System.out.print(">> ");
        new Scanner(System.in);
        int temp = lerValor.nextInt();
        //velocidade final (em km/h)

        //ler valores inseridos
        float V = velIni + acel * temp;

        V /= 1000;

        if (V <= 40) {
            System.out.println("Veículo muito lento");
        } else if (V > 40 && V <= 60) {
            System.out.println("Velocidade permitida");
        } else if (V > 60 && V <= 80) {
            System.out.println("Velocidade de cruzeiro");
        } else if (V > 80 && V <= 120) {
            System.out.println("Veículo rápido");
        } else {
            System.out.println("Veículo muito rápido");
        }
        System.out.println("Velocidade Final é igual: " + V + " Km/h");

    }
}
