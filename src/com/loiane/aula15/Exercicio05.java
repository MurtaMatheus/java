package com.loiane.cursojava.aula15;
/*Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez.*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Verifica media dos alunos-----");
        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2) /2;

        if (media == 10){
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7 && media <10){
            System.out.println("Aprovado");
        }else if (media < 7){
            System.out.println("Reprovado");
        }else {
            System.out.println("Erro");
        }
    }
}
