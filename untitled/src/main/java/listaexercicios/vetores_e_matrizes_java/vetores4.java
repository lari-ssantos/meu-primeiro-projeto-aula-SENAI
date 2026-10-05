package org.example.vetores_e_matrizes_java;

import java.util.Scanner;

public class vetores4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double [] notas = new double [4];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("informe a nota " + i);
            notas[i] = entrada.nextDouble();
            media += notas [i];
        }

        media /= 4;
        System.out.println("a media eh " + media);
    }
}

