package org.example.vetores_e_matrizes_java;

import java.util.Scanner;

public class vetores1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] valores = new int [5];
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("informe o valor do vetor " + i + ": ");
            valores[i] = entrada.nextInt();
            soma += valores[i];
        }

        System.out.println("o resultado é: " + soma);
    }
}
