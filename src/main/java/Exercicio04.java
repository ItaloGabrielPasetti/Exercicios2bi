
package br.com.ItaloGabrielPasetti.Exercicios2bi;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        double total = 0;

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Digite o preco " + (i + 1) + ": ");
            double preco = entrada.nextDouble();

            System.out.println("Preco " + (i + 1) + ": R$ " + preco);

            total = total + preco;
        }
        System.out.printf("Total da compra: R$ %.2f%n", total);
    }
}