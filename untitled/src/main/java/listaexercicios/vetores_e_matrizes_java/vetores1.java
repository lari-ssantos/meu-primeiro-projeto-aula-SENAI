package org.example.vetores_e_matrizes_java;

public class vetores1 {
    public static void main(String[] args) {
        int [] valores = {8, 5, 2, 5, 10, 7, 5, 3};

        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
            System.out.print(valores[i]);
            if (i == valores.length - 1) break;
            System.out.print(" + ");
        }

        System.out.println(" = " + soma);
    }
}
