/*
40. Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...
 */
package bpmlab.exercicio;

public class Exerc40 {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

        // teste do programa. Imprime os 30 primeiros termos       
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Exerc40.fibo(i) + "\n");
        }

    }

}
