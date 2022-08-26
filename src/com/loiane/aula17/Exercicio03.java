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

        System.out.println("Cadastro de funcionarios");
        /*System.out.println("Informe seu nome: ");
        String nome = scan.next();
        while(nome.length()<3){
            System.out.println("O nome deve ter mais que 3 caracteres, informe seu nome: ");
            nome = scan.next();
        }
        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();
        while(idade<0 && idade >150){
            System.out.println("A idade deve ser maior do que 0 e menor que 150, informe sua idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Informe seu salario: ");
        double  salario = scan.nextDouble();
        while(salario<0 ){
            System.out.println("O salario deve ser maior que 0, informe seu salario: ");
            salario = scan.nextDouble();
        }*/
        System.out.println("Informe seu sexo biologico F- feminino ou M- masculino: ");
        String sexo = scan.next().toUpperCase();
        while ( !sexo.equals("F") || sexo.equals("M") ) {

            System.out.println("Sexo invalido, informe seu sexo: ");
            sexo = scan.next();

        }
        System.out.println(sexo);


    }
}
