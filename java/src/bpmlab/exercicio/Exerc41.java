package bpmlab.exercicio;
//41. Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1, 1, 1, 3, 5, 9, 17, ...

public class Exerc41 {

    public static void main(String[] args) {
        int i, num = 1;
        int matriz[] = new int[20];

        for (i = 1; i <= 20; i++) {
            if (i < 4) {
                matriz[i] = 1;
                System.out.print(matriz[i] + ", ");
            } else {
                matriz[i] = matriz[(i - 1)] + matriz[(i - 2)] + matriz[(i - 3)];
                System.out.print(matriz[i] + ", ");
            }
        }
    }
}
