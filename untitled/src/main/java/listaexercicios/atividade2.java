import java.util.Scanner;

class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperatura= new double[10];
        int dias = 0;

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Digite a temperatura do dia " + (i + 1) + ": ");
            temperatura[i] = scanner.nextDouble();
        }
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] >30.0) {
                dias++;
            }
        }

        System.out.println("\nNúmero de dias com temperatura acima de 30°C: " + dias);
        scanner.close();
    }
}
