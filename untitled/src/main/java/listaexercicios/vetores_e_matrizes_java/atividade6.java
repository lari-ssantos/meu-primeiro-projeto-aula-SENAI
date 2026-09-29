import java.util.Scanner;

class atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] producao = new double[4][3];
        double[] totalPorCultura = new double[3];


        for (int mes = 0; mes < 4; mes++) {
            System.out.printf("--- Mês %d ---\n", mes + 1);
            for (int cultura = 0; cultura < 3; cultura++) {
                System.out.printf("Informe a produção da Cultura %d: ", cultura + 1);
                producao[mes][cultura] = scanner.nextDouble();
            }
        }


        for (int cultura = 0; cultura < 3; cultura++) {
            for (int mes = 0; mes < 4; mes++) {
                totalPorCultura[cultura] += producao[mes][cultura];
            }
        }

        System.out.println("\n--- Relatório de Produção Total por Cultura ---");
        for (int cultura = 0; cultura < 3; cultura++) {
            System.out.printf("Cultura %d: %.2f\n", (cultura + 1), totalPorCultura[cultura]);
        }

        scanner.close();
    }
}