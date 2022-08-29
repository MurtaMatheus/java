package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.*/
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double populacaoA, populacaoB, numeroAnos = 0, txCrescimentoPopulacaoA, txCrescimentoPopulacaoB;
        boolean executaPrograma = true;
        String escolha = "";

        do {
            System.out.println("Informe a populacao do pais A: ");
            populacaoA = scan.nextInt();
            System.out.println("Informe a taxa de crescimento da populacao A: ");
            txCrescimentoPopulacaoA = scan.nextDouble();
            System.out.println("Informe a populacao do pais B: ");
            populacaoB = scan.nextInt();
            System.out.println("Informe a taxa de crescimento da populacao B: ");
            txCrescimentoPopulacaoB = scan.nextDouble();

            do {


                if (populacaoA < populacaoB && txCrescimentoPopulacaoA > txCrescimentoPopulacaoB) {
                    populacaoA += (populacaoA / 100) * txCrescimentoPopulacaoA;
                    populacaoB += (populacaoB / 100) * txCrescimentoPopulacaoB;
                    numeroAnos++;
                } else {
                    System.out.println("Impossivel executar o programa");
                }


            } while (populacaoA < populacaoB);

            System.out.println("A populacao do pais A vai ultrapassar a do pais B com " + numeroAnos + " anos.");


            System.out.println("Deseja executar o programa novamente? Digite S-sim e N-não");
            escolha = scan.next();
            if (escolha.equalsIgnoreCase("S")) {
                executaPrograma = true;
            } else executaPrograma = false;


        } while (executaPrograma == true);
    }
}

