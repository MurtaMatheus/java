package com.loiane.aula13;

/*Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/


import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----Calculo salario mensal com descontos-----");
        System.out.print("Informe quanto voce ganha por hora? R$");
        double salarioHora = scan.nextDouble();
        System.out.print("Quantas horas voce trabalhou esse mes: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadas;
        double inss = salarioBruto * 0.08;
        double sindicado = salarioBruto * 0.05;
        double irrf = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - (inss+sindicado+irrf);


        System.out.println("______________________________________");
        System.out.println(" + Salario Bruto = R$"+salarioBruto);
        System.out.println("______________________________________");
        System.out.println(" - Contribuicao INSS = R$"+inss);
        System.out.println("______________________________________");
        System.out.println(" - Contribuicao Sindicato = R$"+sindicado);
        System.out.println("______________________________________");
        System.out.println(" = Salario Liquido = R$"+salarioLiquido);
        System.out.println("______________________________________");
    }
}
