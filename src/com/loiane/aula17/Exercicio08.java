package com.loiane.cursojava.aula17;

import java.util.Scanner;
import java.util.logging.SocketHandler;

/*Faça um programa que leia 5 números e informe a soma e a média
dos números.*/
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numeroInformado, soma = 0, media;

        for(int i = 0; i <5; i++){
            System.out.println("Informe um numero");
            numeroInformado = scan.nextDouble();
            soma += numeroInformado;
        }
        media = soma / 5;
        System.out.println("A soma dos numeros informados foi igual a " + soma + " e a media e igual a " + media);
    }
}
