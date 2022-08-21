package com.loiane.aula15;
//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu sexo biologico M(MASCULINO) ou F(FEMININO): ");
        String sexo = scan.next().toUpperCase().trim();

        switch (sexo) {
            case "M":
                System.out.println("M - Masculino");
                break;
            case "F":
                System.out.println("F - Feminino");
                break;
            default:
                System.out.println("Sexo invalido.");
        }
    }
}
