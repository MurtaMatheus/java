package com.loiane.cursojava.aula13;


import java.util.Scanner;

//Faça um Programa que converta metros para centímetros.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----Converter metros para centimetros-----");
        System.out.println("Informe a medida em metros: ");
        float metros = scan.nextFloat();
        System.out.println(metros+ "m, e igual a "+ (metros*100) + "cm");
    }
}
