package com.loiane.cursojava.aula19;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja C[i] = A[i] / float(B[i])*/
public class Exercicio09 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        float[] vetorC = new float[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i * 5;
            vetorB[i] = i+1;
            vetorC[i] = vetorA[i] / (vetorB[i]);
            System.out.println("O valor do vetor A = " + vetorA[i] + " e o valor do vetor B = " + vetorB[i] + " e o valor do vetor C = " + vetorC[i] + " valor de i = " + i);
        }
    }
}
