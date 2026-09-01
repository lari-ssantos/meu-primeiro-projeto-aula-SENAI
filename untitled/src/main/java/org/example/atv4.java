package org.example;
import java.util.Scanner;

public class atv4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double n1;
        System.out.println("digite a nota do alno (de 0 a 10): ");
        n1 = sc.nextDouble();

        if (n1 >= 9) {
            System.out.println("nota EXCELENTE!" );
        }
        else if (n1 >= 7) {
            System.out.println("nota BOA!" );
        }
        else if (n1 >= 5) {
            System.out.println("nota REGULAR!" );
        }
        else {
            System.out.println("nota RUIM!" );
        }
    }
}
