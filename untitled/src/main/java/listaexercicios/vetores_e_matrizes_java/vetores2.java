package org.example.vetores_e_matrizes_java;

import java.util.Scanner;

public class vetores2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] meuNome = {'L', 'A', 'R', 'I', 'S', 'S', 'A'};

        System.out.println("Informe a letra que procuras ");
        char chute = entrada.next().charAt(0);

        for(int i = 0; i <meuNome.length; i++) {
            if (meuNome[i] == chute) {
                System.out.println("Letra " + chute + " na posição " + i);
            }
        }
    }
}
