package com.loiane.aula13;

import java.util.Scanner;

/* Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58*/
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----Calculo peso ideal-----");
        System.out.println("Informe sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("O seu peso ideal é: " + ((72.7*altura)-58));
    }
}
