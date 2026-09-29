import java.util.Scanner;

class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] umidades = new double[8];
        int contadorBaixaUmidade = 0;


        for (int i = 0; i < 8; i++) {
            System.out.printf("Informe a umidade (%%) da área [%d]: ", i + 1);
            umidades[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 8; i++) {
            if (umidades[i] < 40.0) {
                contadorBaixaUmidade++;
            }
        }

        System.out.println("\n--- Relatório de Umidade ---");
        System.out.println("Quantidade de áreas com umidade inferior a 40%: " + contadorBaixaUmidade);

        scanner.close();
    }
}