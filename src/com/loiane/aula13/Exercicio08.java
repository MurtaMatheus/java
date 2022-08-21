package com.loiane.cursojava.aula13;

/*Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----Calculo salario mensal-----");
        System.out.print("Informe quanto voce ganha por hora? R$");
        double valor = scan.nextDouble();
        System.out.print("Quantas horas voce trabalhou esse mes: ");
        double hora = scan.nextDouble();

        System.out.println("Esse mes voce vai receber R$" + (valor*hora));
    }
}
