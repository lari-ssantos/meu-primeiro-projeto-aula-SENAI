package org.example;
import java.util.Scanner;

public class atv3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("o maior número é: " + n1);
        } else {
            System.out.println("o maior número é: " +n2);
        }
    }
}
