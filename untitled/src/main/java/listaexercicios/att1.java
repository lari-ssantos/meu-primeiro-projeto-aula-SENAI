package org.example;
import java.util.Scanner;

public class att1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Tu é maior de idade");
        } else {
            System.out.println("Tu é menor de idade");
        }
    }
}
