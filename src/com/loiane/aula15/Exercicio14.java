package com.loiane.cursojava.aula15;

import java.util.Scanner;

/*Faça um programa que lê as quatro notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.*/
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----Media 4 notas bimestrais-----");
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = scan.nextDouble();
        System.out.println("Informe a quarta nota: ");
        double nota4 = scan.nextDouble();
        String conceito = "";

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media <= 4) {
            conceito = "E";
        } else if (media > 4 && media <= 6) {
            conceito = "D";
        } else if (media > 6 && media <= 7.5) {
            conceito = "C";
        } else if (media > 7.5 && media <= 9) {
            conceito = "B";
        } else {
            conceito = "A";
        }
        System.out.println("As notas tirados pelo aluno são " + nota1 + ", "+ nota2 + ", "+ nota3 + ", "+ nota4 +
                ", a media das notas "+ media + " ficou com conceito " + conceito + " e está " +
                ((conceito == "A" || conceito == "B" || conceito == "C")?"APROVADO":"REPROVADO"));
    }

}
