package com.loiane.cursojava.aula15;

import java.util.Scanner;

/*Faça um Programa que leia três números e mostre-os em ordem
decrescente.*/
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        double num1 = scan.nextDouble();
        System.out.println("Informe o segundo numero: ");
        double num2 = scan.nextDouble();
        System.out.println("Informe o terceiro numero: ");
        double num3 = scan.nextDouble();

          
        if (num1<num2 && num1<num3 && num2<num3){
            System.out.println(num3 + " < " + num2 + " < " + num1);
        } else if (num2<num1 && num1<num2 && num3<num2){
            System.out.println(num2 + " < " + num2 + " < " + num1);
        } else  {
            System.out.println("O maior numero informado foi: "+num3);
        }

    }
}
