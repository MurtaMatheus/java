package com.loiane.cursojava.aula15;

/*Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;*/
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("------Verifica a existencia e o tipo de um triangulo-----");
        System.out.println("Informe o tamanho do primeiro lado: ");
        double l1= scan.nextDouble();
        System.out.println("Informe o tamanho do segundo lado: ");
        double l2= scan.nextDouble();
        System.out.println("Informe o tamanho do terceiro lado: ");
        double l3= scan.nextDouble();

        if (l1 +l2 > l3 && l1+l3>l2 && l2+l3>l1){
            if (l1 == l2 && l1 == l3){
                System.out.println("Com as medidas informadas é possivel formar um triangulo EQUILATERO");
            } else if (l1 == l2 || l1 == l3 || l2 == l3){
                System.out.println("Com as medidas informadas é possivel formar um triangulo ISOCELES");
            } else  {
                System.out.println("Com as medidas informadas é possivel formar um triangulo ESCALENO");
            }
        }else {
            System.out.println("Não é possivel formar um triangulo com as medidas informadas.");
        }
    }
}
