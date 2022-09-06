package com.loiane.cursojava.aula19;
/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5*/
public class Exercicio13 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];

        for (int i =0; i < vetorA.length; i++){
            vetorA[i] += vetorA[i-1] + i;
            System.out.println(vetorA[i]);
            if (vetorA[i]%5==0 && vetorA[i]!= 0){
                System.out.println(vetorA[i] +" e multiplo de 5");
            }
        }
    }
}
