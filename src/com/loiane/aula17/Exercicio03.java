package com.loiane.cursojava.aula17;

import java.util.Scanner;

/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        boolean validadorInformacoes = false;


        System.out.println("Cadastro de funcionarios");
        System.out.println("Informe seu nome: ");
        nome = scan.next();
        while(nome.length()<3){
            System.out.println("O nome deve ter mais que 3 caracteres, informe seu nome: ");
            nome = scan.next();
        }

        do {
            System.out.println("Informe sua idade: ");
            idade = scan.nextInt();
            if (idade > 0 && idade <= 150) {
                validadorInformacoes = true;
            } else {
                System.out.println("Idade invalida!");
            }
        } while (!validadorInformacoes);

        validadorInformacoes = false;

        System.out.println("Informe seu salario: ");
        salario = scan.nextDouble();
        while(salario<=0 ){
            System.out.println("O salario deve ser maior que 0, informe seu salario: ");
            salario = scan.nextDouble();
        }


        do {
            System.out.println("Informe seu sexo biologico F- feminino ou M- masculino: ");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
                validadorInformacoes = true;
            } else {
                System.out.println("Sexo invalido!");
            }
        } while (!validadorInformacoes);

        validadorInformacoes = false;
        do {
            System.out.println("Informe o seu estado civil S-solteiro, C-casado, V-viuvo, D-divorciado: ");
            estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                validadorInformacoes = true;
            } else {
                System.out.println("Estado civil incorreto, informe o seu estado civil conforme orientação abaixo:");
            }
        } while (!validadorInformacoes);

        validadorInformacoes = false;


        System.out.println("Cadastro completo!");

    }
}
