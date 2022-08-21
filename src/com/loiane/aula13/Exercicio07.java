package com.loiane.cursojava.aula13;

import java.util.Scanner;

/*Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.*/
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("-----Mostra o dobro da area do quadrado-----");
        System.out.println("Informe o lado de um quadrado: ");
        double lado = scan.nextDouble();

        System.out.println("O dobro da area do quadrado é igual a: " + Math.pow(lado,2)*2);
        }
}
