package org.example;
import java.util.Scanner;

public class atv2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("digite a nota do aluno: ");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}

