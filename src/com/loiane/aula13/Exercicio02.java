package com.loiane.cursojava.aula13;

import java.util.Scanner;

/*Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].*/
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = scan.nextInt();

        System.out.println("O numero informado foi: " + numero);
    }
}
