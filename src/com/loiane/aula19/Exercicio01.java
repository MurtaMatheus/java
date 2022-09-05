package com.loiane.cursojava.aula19;
/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].*/
public class Exercicio01 {
    public static void main(String[] args) {
    int [] vetorA = new int[5];
    int [] vetorB = new int[5];

    vetorA[0] = 1;
    vetorA[1] = 2;
    vetorA[2] = 3;
    vetorA[3] = 4;
    vetorA[4] = 5;

    for (int i = 0; i<vetorA.length; i++ ){
        vetorB[i] = vetorA[i];
        System.out.println("O valor do vetor A = "+ vetorA[i] + " e o valor do vetor B = " + vetorB[i]);
    }
    }
}
