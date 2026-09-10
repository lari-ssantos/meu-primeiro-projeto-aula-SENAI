package org.example;

import java.util.Scanner;

public class atv6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double salario;
        System.out.println("digite o valor do seu salário ");
        salario = sc.nextDouble();

        if (salario <= 4000) {
            System.out.println("tem direito ao VR!" );
        }

        else {
            System.out.println("não tem direito ao VR!" );
        }
    }
}
