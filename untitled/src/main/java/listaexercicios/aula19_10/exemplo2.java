import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

void main() {
    File arquivo = new File("alunos.txt");

    if (arquivo.exists()) {
        System.out.println("Arquivo ja existe");
    } else {
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Criado com sucesso");
            } else {
                System.out.println("deu ruim");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Scanner entrada = new Scanner(System.in);
    String[] alunos = new String[5];

    for (int i = 0; i < alunos.length; i++) {
        System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
        alunos[i] = entrada.nextLine();
    }

    try (FileWriter escritor = new FileWriter("alunos.txt", true)) {
        for (String aluno : alunos) {
            escritor.write(aluno + "\n");
        }

        System.out.println("Dados escritos com sucesso");

    } catch (IOException e) {
        System.out.println("Windows nao deixou escrever");
    }

    try (FileReader leitor = new FileReader("alunos.txt")){
        int letra;
        while ((letra = leitor.read()) != -1) {
            System.out.print((char) letra);
        }

        System.out.println("\nFim do arquivo");

    } catch (IOException e) {
        System.out.println("Windows nn deixou ler");
    }
}