package org.example;

import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double investimento;

        System.out.print("Digite o valor investido: ");
        investimento = sc.nextDouble();

        if (investimento <= 10000) {
            System.out.println("Categoria: Bronze");
        } else if (investimento <= 50000) {
            System.out.println("Categoria: Prata");
        } else if (investimento <= 100000) {
            System.out.println("Categoria: Ouro");
        } else {
            System.out.println("Categoria: Platinum");
        }

        sc.close();
    }
}