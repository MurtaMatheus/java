package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.*/
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, par=0, impar=0;

        for(int i = 0; i < 10; i++){
            System.out.println("Informe um numero inteiro: ");
            num = scan.nextInt();

            if(num%2 == 0){
                par++;
            }else {
                impar++;
            }
            System.out.println("Voce informou "+ par + " numeros pares e " + impar + "numeros impares.");
        }
    }
}
