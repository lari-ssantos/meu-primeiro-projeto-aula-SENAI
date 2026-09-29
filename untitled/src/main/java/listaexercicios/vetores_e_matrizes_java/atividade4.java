import java.util.Scanner;

class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGeral = 0;
        double[] producaoTalhoes = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf(" Informe a produção do talhão [%d]: ", i + 1);
            producaoTalhoes[i] = scanner.nextDouble();
        }

        System.out.println(" \n--- Relatório de Produção --- ");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Talhão %d: %.2f\n ", (i + 1), producaoTalhoes[i]);
            totalGeral += producaoTalhoes[i];
        }

        System.out.printf("Total geral produzido: %.2f\n", totalGeral);

        scanner.close();
    }
}