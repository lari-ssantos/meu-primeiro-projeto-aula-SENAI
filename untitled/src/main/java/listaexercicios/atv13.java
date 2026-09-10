package org.example;

import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double transacao;

        System.out.print("Digite o valor da transação: ");
        transacao = sc.nextDouble();

        if (transacao > 10000) {
            System.out.println("Transação suspeita! Será analisada.");
        } else {
            System.out.println("Transação normal.");
        }

        sc.close();
    }
}