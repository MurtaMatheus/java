package com.loiane.cursojava.aula19;
/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice), ou seja:
B[i] = A[i] * i*/
public class Exercicio05 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];

        for (int i = 0; i<vetorA.length; i++ ){
            vetorA[i] = i+1;
            vetorB[i] = vetorA[i]*i;
            System.out.println("O valor do vetor A = "+ vetorA[i] + " e o valor do vetor B = " + vetorB[i] + " valor de i = " + i);
        }
    }
}
