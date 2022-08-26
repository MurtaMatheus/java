package com.loiane.cursojava.aula17;
/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido*/
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor entre 0 e 10");
        double valor = scan.nextDouble();

        while (valor < 0 || valor > 10){
            System.out.println("Valor incorreto, insira um valor entre 0 e 10: ");
            valor= scan.nextDouble();
        }

        System.out.println("O valor informado foi: "+ valor);



    }
}
