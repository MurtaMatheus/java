package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:*/
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numInformado = scan.nextInt();

        System.out.println("Tabuada de "+ numInformado);

        for (int i = 1; i <=10; i++){
            System.out.println( i + " x "+ numInformado  + " = " + (i*numInformado));
        }
    }
}
