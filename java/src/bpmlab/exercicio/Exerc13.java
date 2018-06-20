package bpmlab.exercicio;

import java.util.Scanner;

/**
 * Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
 * valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de
 * percurso (em s) que serão digitados. V = Vinicial + aceleração * tempo
 *
 * @author harleym
 */
public class Exerc13 {

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

        System.out.println("Velocidade Final é igual: " + V + " Km/h");

    }

}
