package com.loiane.cursojava.aula19;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/
public class Exercicio12 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] += vetorA[i] + i;
            System.out.println(vetorA[i]);
        }
    }
}
