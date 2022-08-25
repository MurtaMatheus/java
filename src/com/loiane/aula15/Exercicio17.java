package com.loiane.cursojava.aula15;

import java.time.Year;
import java.util.Scanner;

/* Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.*/
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Identifica se um ano é bissexto-----");


        System.out.println("Diga-me o ano que deseja ");
        int ano = scan.nextInt();

        System.out.println(Year.isLeap(ano));


    }
}
