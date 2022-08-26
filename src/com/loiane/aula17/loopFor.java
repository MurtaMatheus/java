package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class loopFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um limite para o contador");
        int limite = scan.nextInt();

        for(int i =1; i<=limite; i++){
            System.out.println(i);
        }
    }
}
