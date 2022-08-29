package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.*/
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, expoente, produto=1;
        System.out.println("Informe a base da operacao: ");
        base = scan.nextInt();
        System.out.println("Informe o expoente da operacao: ");
        expoente = scan.nextInt();

        for (int i = 0; i < expoente; i++){
            produto *= base;
        }
        System.out.println(produto);
    }
}
