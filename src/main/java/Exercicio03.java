package br.com.ItaloGabrielPasetti.Exercicios2bi;

import java.util.Scanner;

    public class Exercicio03
    {

        public static void main(String[] args)
        {

            Scanner entrada = new Scanner(System.in);

            double soma = 0;

            for (int i = 0; i < 4; i++)
            {
                System.out.println("Diga a nota " + (i + 1) + ": ");
                double nota = entrada.nextDouble();
                soma = soma + nota;
            }
                double media = soma / 4;
                System.out.printf("Media: %.2f%n", media);
            if (media >= 6)
            {
                System.out.println("Aprovado!");
            }
            else
            {
                System.out.println("REPROVADO!!");
            }
        }
    }