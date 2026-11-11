package br.com.ItaloGabrielPasetti.Exercicios2bi;

    import java.util.Scanner;

        public class Exercicio06 {

            public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);

                double valor;
                double taxa;

                double[] divida = new double[12];

                System.out.println("Diga o valor do imprestimo 0-0");
                valor = sc.nextDouble();

                System.out.println("valor da taxa XD");
                taxa = sc.nextDouble();

                for(int i = 0; i < 12; i++)
                {
                    divida[i] = valor + valor * taxa / 100 * (i +1);
                }
                for(int i =0; i < 12; i++)
                {
                    System.out.printf("mes %d: RS %.2f%n", + (i + 1), + divida[i]);
                }
            }
        }