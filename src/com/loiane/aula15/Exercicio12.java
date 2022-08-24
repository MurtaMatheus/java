package com.loiane.cursojava.aula15;

import java.util.Scanner;

/* Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.*/
public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("-----Calculo folha pagamento-----");
        System.out.print("Informe quanto voce ganha por hora? R$");
        double salarioHora = scan.nextDouble();
        System.out.print("Quantas horas voce trabalhou esse mes: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadas;
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double sindicado = salarioBruto * 0.03;
        double irrf = 0;


        if (salarioBruto <= 900) {
            irrf = salarioBruto * 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            irrf = salarioBruto * 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            irrf = salarioBruto * 0.1;
        } else {
            irrf = salarioBruto * 0.2;
        }

        double totalDescontos = inss + sindicado + irrf;
        double salarioLiquido = salarioBruto - (totalDescontos);

        System.out.println("______________________________________");
        System.out.println(" + Salario Bruto    : R$" + salarioBruto);
        System.out.println(" - INSS             : R$" + inss);
        System.out.println(" - IRRF             : R$" + irrf);
        System.out.println("   FGTS             : R$" + fgts);
        System.out.println(" - Sindicato        : R$" + sindicado);
        System.out.println("______________________________________");
        System.out.println(" = Total descontos  : R$" + totalDescontos);
        System.out.println("______________________________________");
        System.out.println(" = Salario Liquido  : R$" + salarioLiquido);
        System.out.println("______________________________________");

    }
}
