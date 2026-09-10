package org.example;

import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String resposta;
        System.out.println("O funcionário está em qual cargo?");
        resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("administrativo")) {
            System.out.println("Tem direito ao curso!");
        }
        else if (resposta.equalsIgnoreCase("liderança")) {
            System.out.println("tem direito ao curso!");
        }
        else {
            System.out.println("Não tem direito ao curso!");
        }

        sc.close();
    }
}
