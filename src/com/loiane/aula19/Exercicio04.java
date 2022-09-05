package com.loiane.cursojava.aula19;
/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i])*/
public class Exercicio04 {
    public static void main(String[] args) {
        int [] vetorA = new int[15];
        double [] vetorB = new double[15];

        for (int i = 0; i<vetorA.length; i++ ){
            vetorA[i] = i+1;
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("O valor do vetor A = "+ vetorA[i] + " e o valor do vetor B = " + vetorB[i]);
        }
    }
}
