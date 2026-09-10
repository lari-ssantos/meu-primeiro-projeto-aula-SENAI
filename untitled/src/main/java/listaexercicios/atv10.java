package org.example;

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario;
        double parcela;

        System.out.print("Digite o salário do cliente: ");
        salario = sc.nextDouble();

        System.out.print("Digite o valor da parcela desejada: ");
        parcela = sc.nextDouble();

        if (parcela <= salario * 0.30) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo recusado!");
        }

        sc.close();
    }
}