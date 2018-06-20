package bpmlab.exercicio;

public class Exerc49 {

    public static void main(String args[]) {

        int a, b, c, d, e, f, count = 0;

        for (a = 1; a <= 60; a++) {
            for (b = a + 1; a <= 60; a++) {
                for (c = b + 1; c <= 60; c++) {
                    for (d = c + 1; d <= 60; d++) {
                        for (e = d + 1; e <= 60; e++) {
                            for (f = e + 1; f < 60; f++) {
                                System.out.printf("Dezenas: %d %d %d "
                                        + "%d %d %d", a, b, c, d, e, f);
                                System.out.println();
                                count++;

                            }
                        }
                    }
                }
            }
        }
        System.out.println("Possibilidades: " + count);
    }
}
