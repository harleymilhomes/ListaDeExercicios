/*
35. Exibir a tabuada do número cinco no intervalo de um a dez.
 */
package bpmlab.exercicio;

public class Exerc35 {

    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            int b = 5 * a;
            System.out.println("5 x " + a + " = " + b);
        }
    }

}
