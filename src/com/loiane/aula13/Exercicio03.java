package com.loiane.cursojava.aula13;

import java.util.Scanner;

/*Faça um Programa que peça dois números e imprima a soma.*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = scan.nextInt();

        System.out.println("A soma entre " + num1 + " + "  + num2 + " = " + (num1+num2));

    }
}
