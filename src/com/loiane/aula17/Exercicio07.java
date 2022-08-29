package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número.*/
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numeroDigitado;
        double maior = -200000;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um numero: ");
            numeroDigitado = scan.nextDouble();
            if (numeroDigitado > maior) {
                maior = numeroDigitado;
            }

        }
        System.out.println("O maior numero informado foi " + maior);

    }
}
