package br.com.ItaloGabrielPasetti.Exercicios2bi;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ;

        double[] precos = new double[5];
        double[] desconto = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("preços numero: " + (i + 1));
            precos[i] = sc.nextDouble();

            desconto[i] = precos[i] * 0.90;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("preços normais " + precos[i]
                    + " preços descontados " + desconto[i]);
        }
    }
}
