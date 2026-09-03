package org.example;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

class Main1 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        int valorInt = 56;
        double valorDouble = valorInt;

        System.out.println("O valor é " + valorDouble);
    }
}

