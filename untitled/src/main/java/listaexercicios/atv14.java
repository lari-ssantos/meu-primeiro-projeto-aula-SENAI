package org.example;

import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldoMedio;

        System.out.print("Digite o saldo médio mensal: ");
        saldoMedio = sc.nextDouble();

        if (saldoMedio > 5000) {
            System.out.println("Cliente tem direito à isenção de tarifa.");
        } else {
            System.out.println("Tarifa bancária será mantida.");
        }

        sc.close();
    }
}