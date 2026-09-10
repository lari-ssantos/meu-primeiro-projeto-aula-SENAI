package org.example;

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo;
        System.out.println("digite o seu tempo na empresa ");
        tempo = sc.nextInt();

        if (tempo >= 3) {
            System.out.println("tem direito ao plano de saúde!" );
        }

        else {
            System.out.println("não tem direito ao plano de saúde!" );
        }
    }
}

