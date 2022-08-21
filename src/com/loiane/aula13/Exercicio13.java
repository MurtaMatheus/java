package com.loiane.aula13;

/*Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Calculo peso ideal/sexo-----");
        System.out.println("Informe a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Informe o seu sexo biologico M(MASCULINO) ou F(FEMININO): ");
        String sexo = scan.next().toUpperCase().trim();

        switch (sexo) {
            case "M":
                System.out.println("Baseado na sua altura o seu peso ideal e igaual a: "+((altura*72.7)-58));
                break;
            case "F":
                System.out.println("Baseado na sua altura o seu peso ideal e igaual a: "+((altura*62.1)-44.7));
                break;
            default:
                System.out.println("Entrada inválida!");
        }

        /*if (sexo == 1){
            System.out.println("Baseado na sua altura o seu peso ideal e igaual a: "+((altura*72.7)-58));
        }        else if (sexo == 0){
            System.out.println("Baseado na sua altura o seu peso ideal e igaual a: "+((altura*62.1)-44.7));
        }        else {
            System.out.println("Sexo invalido!");
        }*/


    }
}
