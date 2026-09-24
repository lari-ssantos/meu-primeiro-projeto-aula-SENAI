import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] producaoSemanal = new double[7];
        double producaoTotal = 0;

        System.out.println("Digite a produção de milho (em toneladas) para cada uma das 7 semanas:");
        for (int i = 0; i < producaoSemanal.length; i++) {
            System.out.print("Semana " + (i + 1) + ": ");
            producaoSemanal[i] = scanner.nextDouble();
            producaoTotal += producaoSemanal[i];
        }

        double mediaSemanal = producaoTotal / 7;

        double maiorProducao = producaoSemanal[0];
        for (int i = 1; i < producaoSemanal.length; i++) {
            if (producaoSemanal[i] > maiorProducao) {
                maiorProducao = producaoSemanal[i];
            }
        }

        System.out.println("\n--- RESULTADOS DO RELATÓRIO ---");
        System.out.printf("Produção Total: %.2f toneladas\n", producaoTotal);
        System.out.printf("Média Semanal: %.2f toneladas\n", mediaSemanal);
        System.out.printf("Maior Produção Registrada: %.2f toneladas\n", maiorProducao);

        scanner.close();
    }
}