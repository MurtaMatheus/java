package com.loiane.cursojava.aula15;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Verifica se foi digitado vogal ou consoante-----");
        System.out.println("Digite uma letra: ");
        String letra = scan.next().toUpperCase().trim();

        switch (letra) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Voce digitou a vogal: " + letra);
                break;
            case "0":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
            case "1":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
            case "2":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
            case "3":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
            case "4":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
            case "5":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
            case "6":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
            case "7":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
            case "8":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
            case "9":
                System.out.println("Entrada invalida, voce digitou o numero: "+letra);
                break;
            default:
                System.out.println("Voce digitou a consoante: " + letra);

        }

    }
}
