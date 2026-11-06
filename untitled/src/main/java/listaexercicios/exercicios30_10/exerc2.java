package org.example.exercicios30_10;

import java.io.*;
import java.util.Arrays;

public class exerc2 {
    public static void main(String[] args) {

        String arquivo = "C:/Users/45721294876/Downloads/ativos.csv";

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/45721294876/Downloads/ativos.csv"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:/Users/45721294876/Downloads/ativos.csv"));

            String linha = leitor.readLine();
            escritor.write(linha+",criticidade");
            escritor.newLine();

            while((linha = leitor.readLine()) != null){
                String[] dados = linha.split(",");
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                String criticidade;

                if(so.contains("Linux")){
                    criticidade = "Alta";
                } else {
                    criticidade = "Baixa";
                }

                escritor.write(
                        host + "," +
                                ip + "," +
                                so + "," +
                                criticidade
                );

                escritor.newLine();
            }

            leitor.close();
            escritor.close();

            System.out.println("deu tudo certo aí vius ");

        } catch (IOException e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}