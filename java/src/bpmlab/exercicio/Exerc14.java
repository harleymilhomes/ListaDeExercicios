package bpmlab.exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exerc14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float r, a;
        double vol;

        System.out.println("VOLUME DA ESFERA NO CUBO\n");
        System.out.print("Raio: ");
        r = ler.nextFloat();
        System.out.print("Aresta do cubo: ");
        a = ler.nextFloat();

        vol = (Math.PI * Math.pow(a, 3)) / 6;

        System.out.printf("Volume da esfera no cubo: %.2f", vol);

    }
}
