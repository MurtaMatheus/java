package com.loiane.cursojava.aula19;
/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2*/
public class Exercicio10 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];
        float [] vetorB = new float[10];

        for (int i = 0; i<vetorA.length; i++){
            vetorA[i] = i+1;
            vetorB[i] = vetorA[i]%2;
            System.out.println("O valor do vetor A = "+ vetorA[i] + " e o valor do vetor B = " + vetorB[i]);

        }
    }
}
