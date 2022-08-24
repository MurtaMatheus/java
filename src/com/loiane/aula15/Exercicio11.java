package com.loiane.cursojava.aula15;

import java.util.Scanner;

/*As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.*/
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----Calcula aumento salario------");
        System.out.println("Informe o valor da salario: R$");
        double salarioAtual = scan.nextDouble();
        double valorAumento = 0;
        int percentualAumento = 0;
        double novoSalario = 0;

        if (salarioAtual <= 280) {
            percentualAumento = 20;
            valorAumento = salarioAtual * percentualAumento / 100;
            novoSalario = salarioAtual + valorAumento;

            System.out.println("O salário antes do reajuste R$" + salarioAtual);
            System.out.println("O percentual de aumento aplicado " + percentualAumento + "%");
            System.out.println("O valor do aumento R$" + valorAumento);
            System.out.println("O novo salário, após o aumento R$" + novoSalario);

        } else if (salarioAtual > 280 && salarioAtual <= 700) {
            percentualAumento = 15;
            valorAumento = salarioAtual * percentualAumento / 100;
            novoSalario = salarioAtual + valorAumento;

            System.out.println("O salário antes do reajuste R$" + salarioAtual);
            System.out.println("O percentual de aumento aplicado " + percentualAumento + "%");
            System.out.println("O valor do aumento R$" + valorAumento);
            System.out.println("O novo salário, após o aumento R$" + novoSalario);
        } else if (salarioAtual > 700 && salarioAtual <= 1500) {
            percentualAumento = 10;
            valorAumento = salarioAtual * percentualAumento / 100;
            novoSalario = salarioAtual + valorAumento;

            System.out.println("O salário antes do reajuste R$" + salarioAtual);
            System.out.println("O percentual de aumento aplicado " + percentualAumento + "%");
            System.out.println("O valor do aumento R$" + valorAumento);
            System.out.println("O novo salário, após o aumento R$" + novoSalario);
        } else {
            percentualAumento = 5;
            valorAumento = salarioAtual * percentualAumento / 100;
            novoSalario = salarioAtual + valorAumento;

            System.out.println("O salário antes do reajuste R$" + salarioAtual);
            System.out.println("O percentual de aumento aplicado " + percentualAumento + "%");
            System.out.println("O valor do aumento R$" + valorAumento);
            System.out.println("O novo salário, após o aumento R$" + novoSalario);
        }
    }

}
