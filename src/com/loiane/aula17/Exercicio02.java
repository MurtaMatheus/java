package com.loiane.cursojava.aula17;
/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um usuário: ");
        String user = scan.next().trim();
        System.out.println("Informe uma senha: ");
        String password = scan.next();

        while (user.equals(password)){
            System.out.println("Usuario nao pode ser igual a senha.");
            System.out.println("Informe um usuário: ");
            user = scan.next().trim();
            System.out.println("Informe uma senha: ");
            password = scan.next();
        }
        System.out.println("Usuario criado com sucesso");
    }
}
