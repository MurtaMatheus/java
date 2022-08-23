package com.loiane.cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

/*Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.*/
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite o horario que voce estuda M- Matutino ou V-Vespertino ou N- Noturno: ");
        String escolha = scan.next().toUpperCase().trim();

        switch (escolha) {
            case "M":
                System.out.printf("Bom dia!");
                break;
            case "V":
                System.out.printf("Boa tarde!");
                break;
            case "N":
                System.out.printf("Boa Noite!");
                break;
            default:
                System.out.printf("Opção invalida!");
        }
    }
}
