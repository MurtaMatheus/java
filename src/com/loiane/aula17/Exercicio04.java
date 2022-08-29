package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.*/
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double populacaoPaisA = 80000;
        double populacaoPaisB = 200000;
        int numeroAnos=0;

        for(;populacaoPaisA<populacaoPaisB;numeroAnos++){
            populacaoPaisA += populacaoPaisA * 0.03; //crescimento 3%
            populacaoPaisB += populacaoPaisB * 0.015; //crescimento 1,5%
        }

        System.out.println("A populacao do pais A vai ultrapassar a do pais B com "+ numeroAnos + " anos.");

    }
}
