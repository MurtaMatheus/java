package com.loiane.cursojava.aula13;

/*Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).*/

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("-----Transforma graus Farenheit / Celsius");
        System.out.println("Informe a temperatura em graus Farenheit: ");
        double farenheit = scan.nextDouble();

        System.out.println("A temperatura em graus Celsius e: " + (5*(farenheit-32)/9));
    }
}
