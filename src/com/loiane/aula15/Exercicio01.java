package com.loiane.aula15;
//Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----Solicita dois numeros e imprime o maior-----");
        System.out.println("\n Insira um numero: ");
        double num1 = scan.nextDouble();
        System.out.println("\n Insira o segundo numero: ");
        double num2 = scan.nextDouble();

        System.out.println("O maior numero informado foi: " + (num1 > num2 ? num1 : num2));
    }
}
