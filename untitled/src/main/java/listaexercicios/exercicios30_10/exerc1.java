package org.example.exercicios30_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class exerc1 {
    public static void main(String[] args) {

        String arquivo = "C:/Users/45721294876/Downloads/ativos.csv";

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {

            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dado = linha.split(",");
                String hosts = dado[0];
                String ips = dado[1];
                String so = dado[2];

                System.out.println("Host: "+ hosts);
                System.out.println("IPS: "+ ips);
                System.out.println("SO: "+ so);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}