import java.util.Scanner;

class atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] chuva = new double[7][4];
        double[] totalPorArea = new double[4];

        for (int dia = 0; dia < 7; dia++) {
            System.out.printf("--- Dia %d ---\n", dia + 1);
            for (int area = 0; area < 4; area++) {
                System.out.printf("Informe a chuva registrada na Área %d (mm): ", area + 1);
                chuva[dia][area] = scanner.nextDouble();
            }
        }

        for (int area = 0; area < 4; area++) {
            for (int dia = 0; dia < 7; dia++) {
                totalPorArea[area] += chuva[dia][area];
            }
        }

        System.out.println("\n--- Total de Chuva por Área (em mm) ---");
        for (int area = 0; area < 4; area++) {
            System.out.printf("Área %d: %.2f mm\n", (area + 1), totalPorArea[area]);
        }

        scanner.close();
    }
}