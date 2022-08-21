package com.loiane.aula13;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/* Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total.*/
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Calculo latas tinta 18l-----");
        System.out.println("Informe a m² a ser pintada: ");
        double metragem = scan.nextDouble();
        double litrosTinta = metragem/3;
        int latas = (int) Math.ceil(litrosTinta/18);

        System.out.println("Para pintar "+metragem+"m², você vai precisar comprar "+latas+" latas de tinta e isso vai lhe custar R$"+(latas*80));

    }



}
