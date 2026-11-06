package org.example.exercicios30_10;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class exerc2 {
    public static void main(String[] args) {

        String arquivoEntrada = "C:/Users/45721294876/Downloads/ativos.csv";
        String arquivoSaida = "C:/Users/45721294876/Downloads/ativos_processados.csv";
        String arquivoCriticos = "C:/Users/45721294876/Downloads/ativos_criticos.csv";

        int countWindows = 0;
        int countLinux = 0;
        int countMac = 0;

        String dataAtual = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        try (
                BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
                BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida));
                BufferedWriter escritorCriticos = new BufferedWriter(new FileWriter(arquivoCriticos))
        ) {
            String linha = leitor.readLine();

            String cabecalho = linha + ",criticidade,status,data_auditoria,risco";
            escritor.write(cabecalho);
            escritor.newLine();

            escritorCriticos.write(cabecalho);
            escritorCriticos.newLine();

            while ((linha = leitor.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;

                String[] dados = linha.split(",");
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                if (so.contains("Windows")) {
                    countWindows++;
                } else if (so.contains("Linux")) {
                    countLinux++;
                } else if (so.contains("Mac") || so.contains("macOS")) {
                    countMac++;
                }

                String criticidade;
                if (so.contains("Linux")) {
                    criticidade = "Alta";
                } else {
                    criticidade = "Baixa";
                }

                String status;
                if (so.contains("Windows")) {
                    status = "Online";
                } else if (so.contains("Linux")) {
                    status = "Em Monitoramento";
                } else {
                    status = "Desconhecido";
                }

                int risco = criticidade.equals("Alta") ? 10 : 1;

                String linhaProcessada = String.format("%s,%s,%s,%s,%s,%s,%d",
                        host, ip, so, criticidade, status, dataAtual, risco);

                escritor.write(linhaProcessada);
                escritor.newLine();

                if (criticidade.equals("Alta")) {
                    escritorCriticos.write(linhaProcessada);
                    escritorCriticos.newLine();
                }
            }

            System.out.println("=== Relatório de Sistemas Operacionais ===");
            System.out.println("Windows: " + countWindows);
            System.out.println("Linux: " + countLinux);
            System.out.println("macOS: " + countMac);
            System.out.println("==========================================");
            System.out.println("Arquivos gerados com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}