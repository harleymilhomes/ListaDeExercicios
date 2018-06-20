package bpmlab.exercicio;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        //Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
        System.out.println("Digite o valor da Aresta do seu quadrado");
        System.out.print(">> ");
        //pega os dados inseridos pelo usuario
        Scanner lerAresta = new Scanner(System.in);
        int aresta = lerAresta.nextInt();

        //Calcular a área do quadrado A = (b*h) 
        float A = aresta * aresta;
        System.out.print("A área do quadrado é igual: ");
        System.out.println(A);
    }
}
