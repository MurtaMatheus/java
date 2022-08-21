package com.loiane.aula13;

/*Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Resultado de alguma operações entre numeros-----");
        System.out.println("Informe um numero inteiro: ");
        int int1 = scan.nextInt();
        System.out.println("Informe o segundo numero inteiro: ");
        int int2 = scan.nextInt();
        System.out.println("Informe um numero real: ");
        double real = scan.nextDouble();

        System.out.println("---------------------------------------------------------------");
        System.out.println("Os numeros digitados foram: "+int1 + ", "+ int2 + ", " + real);
        System.out.println("O produto do dobro do primeiro com metade do segundo. " + ((int1 * 2)*(int2/2)));
        System.out.println("---------------------------------------------------------------");


        System.out.println("a soma do triplo do primeiro com o terceiro " + ((int1 * 3)+(real)));
        System.out.println("---------------------------------------------------------------");

        System.out.println("o terceiro elevado ao cubo " + Math.pow(real,3));
        System.out.println("---------------------------------------------------------------");
    }
}
