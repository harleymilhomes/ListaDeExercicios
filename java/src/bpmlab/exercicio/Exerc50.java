package bpmlab.exercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc50 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int opt = 0, num1, num2;
        float result;
        boolean continua = true, teste = false;

        System.out.println("Digite o primeiro numero");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = ler.nextInt();

        do {

            try {

                System.out.println("1– Multiplicação");
                System.out.println("2– Adição");
                System.out.println("3– Divisão");
                System.out.println("4– Subtração");
                System.out.println("5– Fim de processo");
                opt = ler.nextInt();
                continua = false;
                opt = opt;

            } catch (InputMismatchException erroEntrada) {
                System.out.println("Erro de entrada. Somente numeros!");
                ler.nextLine();
            }

            switch (opt) {
                case 1:
                    result = num1 * num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 2:
                    result = num1 + num2;
                    System.out.println("Resultado: " + result);
                    break;

                case 3:
                    do {
                        try {
                            if (num2 != 0) {
                                result = (float) num1 / num2;
                                System.out.println("Resultado: " + result);
                                teste = true;
                            } else {
                                System.out.print("Digite o denominador novamente: ");
                                num2 = ler.nextInt();
                                result = (float) num1 / num2;
                                teste = true;
                                System.out.println("Resultado: " + result);
                            }
                        } catch (ArithmeticException erroDivisao) {
                            System.out.println("O denominador precisa ser diferente de 0");
                            ler.nextLine();
                        }
                    } while (!teste);
                    break;

                case 4:
                    result = num1 - num2;
                    System.out.println("Resultado: " + result);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Opcao invalida\n");
                    break;
            }
        } while ((opt < 0) || (opt > 5) || (continua));
    }
}
