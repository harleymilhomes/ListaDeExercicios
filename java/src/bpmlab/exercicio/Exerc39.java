/*
39. Exibir a soma dos números inteiros positivos do intervalo de um a cem.
 */
package bpmlab.exercicio;

public class Exerc39 {

    public static void main(String[] args) {
        int c = 0;
        for (int i = 1; i <= 100; i++) {

            c = c + i;
        }
        System.out.println("Soma é igual: " + c);
    }
}
