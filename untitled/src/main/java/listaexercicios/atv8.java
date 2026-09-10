package org.example;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;
        System.out.println("O funcionário utiliza veículo próprio? (S/N)");
        resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Tem direito ao auxílio combustível!");
        } else {
            System.out.println("Não tem direito ao auxílio combustível!");
        }

        sc.close();
    }
}