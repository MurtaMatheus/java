package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Faça um programa que imprima na tela os números de 1 a 20, um
abaixo do outro. Depois modifique o programa para que ele mostre os
números um ao lado do outro.*/
public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Imprimir os numeros de 1 a 20 um abaixo do outro");

        for (int i = 1; i<=20; i++){
            System.out.println(i);
        }

        System.out.println("Imprimir os numeros de 1 a 20 um apos o outro");

        for (int i = 1; i<=20; i++){
            System.out.print(i + " - ");
        }
    }
}
