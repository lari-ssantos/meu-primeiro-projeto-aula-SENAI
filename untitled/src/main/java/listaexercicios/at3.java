package org.example;

import java.util.Scanner;

public class at3 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double venda = 0;
        double soma = 0;
        int contador;

        for (contador = 1; contador <= 5; contador++) {
            System.out.println("informe o valor da venda ");
            venda = sc.nextDouble();
            soma += venda;

        }
            System.out.println("a soma de todas as vendas é igual a " + soma);
    }
}