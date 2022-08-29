package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.*/
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int populacaoA, populacaoB, numeroAnos = 0, txCrescimentoPopulacaoA, txCrescimentoPopulacaoB;

        System.out.println("Informe a populacao do pais A: ");
        populacaoA = scan.nextInt();
        System.out.println("Informe a taxa de crecimento da populacao A: ");
        txCrescimentoPopulacaoA = scan.nextInt();
        System.out.println("Informe a populacao do pais B: ");
        populacaoB = scan.nextInt();
        System.out.println("Informe a taxa de crecimento da populacao B: ");
        txCrescimentoPopulacaoB = scan.nextInt();


    }
}
