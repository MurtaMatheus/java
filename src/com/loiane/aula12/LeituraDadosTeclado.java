package com.loiane.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

/*        System.out.printf("Escreva o seu nome completo: \n");
        String nomeCompleto = scan.nextLine();


        System.out.printf("O seu nome completo é: "+ nomeCompleto);

        System.out.printf("\nEscreva o seu primeiro nome: ");
        String primeiroNome = scan.next();

        System.out.printf("O seu primeiro nome é: "+ primeiroNome);*/

        /*System.out.printf("\nDigite a sua idade: ");
        int idade = scan.nextInt();
        System.out.printf("\n Sua idade é " + idade);*/

       /* System.out.printf("\nDigite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.printf("\n Sua altura é " + altura);*/


        System.out.printf("Digite o seu nome, idade, altura, quantidade de filhos e se tem bicho de estimação: \n");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        float altura = scan.nextFloat();
        byte qtdFilhos = scan.nextByte();
        boolean pet = scan.nextBoolean();

        System.out.printf("Seu nome é: " +primeiroNome + ", nasceu no ano: " + (2022 - idade )+ ", tem: " + altura +"m, quantidade de filhos: " + qtdFilhos + ", possui animais de estimação: " + pet);
    }

}
