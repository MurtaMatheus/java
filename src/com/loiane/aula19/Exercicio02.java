package com.loiane.cursojava.aula19;
/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2*/
public class Exercicio02 {
    public static void main(String[] args) {
        int [] vetorA = new int[8];
        int [] vetorB = new int[8];

        for (int i = 0; i<vetorA.length; i++ ){
            vetorA[i] = i+1;
            vetorB[i] = vetorA[i]*2;
            System.out.println("O valor do vetor A = "+ vetorA[i] + " e o valor do vetor B = " + vetorB[i]);
        }
    }
}
