package com.loiane.cursojava.aula15;

import java.util.Scanner;

/*Faça um Programa que leia três números e mostre-os em ordem
decrescente.*/
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        double a = scan.nextDouble();
        System.out.println("Informe o segundo numero: ");
        double b = scan.nextDouble();
        System.out.println("Informe o terceiro numero: ");
        double c = scan.nextDouble();


         if (a > b && a > c && b > c) {
            System.out.printf(a + " > " + b + " > " + c);
        } else if (a > b && a > c && c > b) {
            System.out.printf(a + " > " + c + " > " + b);
        } else if (b > a && b > c && a > c) {
            System.out.printf(b + " > " + a + " > " + c);
        } else if (b > a && b > c && c > a) {
            System.out.printf(b + " > " + c + " > " + a);
        } else if (c > a && c > b && a > b) {
            System.out.printf(c + " > " + a + " > " + b);
        } else if (c > a && c > b && b > a) {
            System.out.printf(c + " > " + b + " > " + a);
        }

    }
}
