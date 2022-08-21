package com.loiane.cursojava.aula13;

import java.util.Scanner;

/* Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.*/
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----Transforma celsius / farenheit-----");
        System.out.println("Informe a temperatura em graus celsius: ");
        double celsius = scan.nextDouble();

        System.out.println("A temperatura em graus farenheit e: " + (celsius * 1.8 + 32));
    }
}
