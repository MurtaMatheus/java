package com.loiane.cursojava.aula19;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a subtração dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] – B[i]*/
public class Exercicio07 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = vetorA[i] * 9;
            vetorC[i] = vetorA[i] - vetorB[i];
            System.out.println("O valor do vetor A = " + vetorA[i] + " e o valor do vetor B = " + vetorB[i] + " e o valor do vetor C = " + vetorC[i] + " valor de i = " + i);
        }

    }
}
