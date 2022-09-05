package com.loiane.cursojava.aula19;
/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].*/
public class Exercicio03 {
    public static void main(String[] args) {
        int [] vetorA = new int[15];
        int [] vetorB = new int[15];

        for (int i = 0; i<vetorA.length; i++ ){
            vetorA[i] = i+1;
            vetorB[i] = vetorA[i]*vetorA[i];
            System.out.println("O valor do vetor A = "+ vetorA[i] + " e o valor do vetor B = " + vetorB[i]);
        }
    }
}
