package com.loiane.cursojava.aula13;

import java.util.Scanner;

/*Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área*/
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Calculo area circulo-----");
        System.out.println("Informe o raio do circulo: ");
        double raio = scan.nextDouble();


        System.out.println("O circulo tem area igual a: "+ (3.1415 * Math.pow(raio, 2)));

    }
}
