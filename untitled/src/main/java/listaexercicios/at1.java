package org.example;
import java.util.Scanner;

public class at1 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        String nome;
        int contador;

        for (contador = 1; contador <= 10; contador++) {
            System.out.println("digite seu nome: ");
            nome = sc.nextLine();
            System.out.println(nome + "está registrado como participante " + contador);
        }
    }
}