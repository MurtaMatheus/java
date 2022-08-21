package com.loiane.aula13;

import java.util.Scanner;

/*João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.*/
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("João pescador -Limite 50kg - Multa R$4,00 por kg excedente");

        System.out.println("Bom dia João, quantos kg o Sr pescou hoje: ");
        double peso = scan.nextDouble();

        if (peso>50){
            double multa = (peso-50)*4;
            System.out.println("Vixe João, hoje o Sr pescou "+ (peso -50) + "kg alem do permitido, vai ter que pagar R$" + multa + " de multa.");
        }
        else {
            System.out.println("Sem multas hoje João, a pescaria do dia ficou dentro do permitido!");
        }
    }
}
