package com.loiane.aula13;

import java.util.Scanner;

/*Faça um Programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas
e os respectivos preços em 3 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;
o misturar latas e galões, de forma que o preço seja o
menor. Acrescente 10% de folga e sempre arredonde os
valores para cima, isto é, considere latas cheias.*/
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a m² a ser pintada: ");
        double metragem = scan.nextDouble();
        double litrosTinta = metragem/6;

        double latas = (int) Math.ceil(litrosTinta/18);
        System.out.println("\nComprando apenas latas de 18l voce precisara comprar "+latas+ " latas e tera um custo de R$"+ latas*80);

        double galoes = (int) Math.ceil(litrosTinta/3.6);
        System.out.println("\nComprando apenas galoes de 3,6l voce precisara comprar " + galoes + " galoes e tera um custo de R$" + galoes*25);

        litrosTinta += litrosTinta*0.10;
        latas = Math.floor(litrosTinta/18);
        galoes = Math.ceil(litrosTinta%3.6);
        System.out.println("\nComprando latas e galoes e abressentando 10% de margem na quantidade de tinta, \n" +
                "voce precisara compra " + latas + "latas e " + galoes +"galoes. E tera um custo de R$"+((latas*80)+(galoes*25)));

    }
}
