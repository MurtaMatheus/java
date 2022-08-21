package com.loiane.aula15;
//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo

import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Verifica se numero é positivo ou negativo-----");
        System.out.println("Informe um numero aleatorio");
        long num = scan.nextLong();
        System.out.println("O numero informado é "+ ((num > 0)?"Positivo": "Negativo"));
    }
}
