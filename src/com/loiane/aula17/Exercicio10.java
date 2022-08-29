package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.*/
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Informe o primeiro numero:");
        num1 = scan.nextInt();
        System.out.println("Informe o segundo numero:");
        num2 = scan.nextInt();
        if (num1 < num2) {
            for (; num1 <= num2; num1++) {
                System.out.println(num1);
            }
           /* while (num1 < num2) {
                num1 += 1;
                System.out.println(num1);
            }*/
        } else if (num2 < num1) {
            for (; num2 <= num1; num2++) {
                System.out.println(num2);
            }
            /*while (num2 < num1) {
                num2 += 1;
                System.out.println(num2);
            }*/

        } else {
            System.out.println("Os numeros digitados são iguais");
        }

    }
}

