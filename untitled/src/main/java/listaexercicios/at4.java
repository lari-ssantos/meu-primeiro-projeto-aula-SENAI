package org.example;

import java.util.Scanner;

public class at4 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int nota = 0;
        int contador = 0;

        while (contador < 10) {
            contador ++;
            System.out.println("Cliente n°" + contador +", avalie a nossa loja");
            nota = sc.nextInt();
        }
        System.out.println(contador + " clientes avaliaram nossa loja");
    }
}
