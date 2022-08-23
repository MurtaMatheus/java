package com.loiane.cursojava.aula15;

import java.util.Scanner;

/*Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual produto devo compra?");

        System.out.println("Informe o preco da Picanha: ");
        double num1 = scan.nextDouble();
        System.out.println("Informe o preco da Maminha: ");
        double num2 = scan.nextDouble();
        System.out.println("Informe o preco do Fraldinha: ");
        double num3 = scan.nextDouble();

        if (num1<num2 && num1<num3){
            System.out.println("Voce deve comprar a Picanha");
        } else if (num2<num1 && num2<num3){
            System.out.println("Voce deve comprar a Maminha");
        } else  {
            System.out.println("Voce deve comprar a Fraldinha");
        }
    }
}
