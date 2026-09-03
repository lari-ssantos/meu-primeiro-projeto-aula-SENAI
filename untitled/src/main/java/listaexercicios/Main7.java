package listaexercicios;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Primjeira nota: ");
        n1 = entrada.nextInt();
        System.out.println("Segunda nota: ");
        n2 = entrada.nextInt();
        System.out.println("Terceira nota: ");
        n3 = entrada.nextInt();

        double media = (((double) 30/100) * n1);
        System.out.println("30% de n1 = " + media);
    }
}

