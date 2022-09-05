package com.loiane.cursojava.aula19;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/
public class Exercicio11 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        float[] vetorB = new float[10];
        int qtdPares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = vetorA[i] % 2;
            System.out.println("O valor do vetor A = " + vetorA[i] + " e o valor do vetor B = " + vetorB[i]);

            if (vetorB[i] == 0) {
                qtdPares++;
            }
        }
        System.out.println(qtdPares + " são pares.");
    }
}
