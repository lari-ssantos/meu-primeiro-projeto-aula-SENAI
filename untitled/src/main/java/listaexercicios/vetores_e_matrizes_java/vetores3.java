package org.example.vetores_e_matrizes_java;

import java.util.Scanner;

public class vetores3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean[] byUser = new boolean[8];
        int contadorTrue = 0;

        for(int i = 0; i < byUser.length; i++) {
            System.out.println("informe o valor do bit " + i);
            byUser[i] = entrada.nextBoolean();
            if(byUser[i] == true) contadorTrue++;
        }

        System.out.println("foiram informados " + contadorTrue + " bits trues");
    }
}
