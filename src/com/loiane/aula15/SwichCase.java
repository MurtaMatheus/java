package com.loiane.aula15;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Digite um numero correspondente a um dia da semana: ");
        int diaDaSemana= scan.nextInt();



        switch (diaDaSemana){
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda!");
                break;
            case 3:
                System.out.println("Terça!");
                break;
            case 4:
                System.out.println("Quarta!");
                break;
            case 5:
                System.out.println("Quinta!");
                break;
            case 6:
                System.out.println("Sexta!");
                break;
            case 7:
                System.out.println("Sabado!");
                break;
            default:
                System.out.println("Não é um dia da semana valido!");

        }
    }
}
