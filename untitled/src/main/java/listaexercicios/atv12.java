package org.example;

import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double renda;
        int score;

        System.out.print("Digite a renda mensal: ");
        renda = sc.nextDouble();

        System.out.print("Digite o score de crédito: ");
        score = sc.nextInt();

        if (renda > 8000 && score > 700) {
            System.out.println("Cartão Premium aprovado!");
        } else {
            System.out.println("Cartão Premium recusado!");
        }

        sc.close();
    }
}