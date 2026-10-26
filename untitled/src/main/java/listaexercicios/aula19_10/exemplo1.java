import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

void main() {
    File arquivo = new File("teste.txt");

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

    try {
        FileWriter escritor = new FileWriter("teste.txt", true);
        escritor.write("é isso ae ");
        escritor.close();
        System.out.println("frase escrita com sucesso");


    } catch (IOException e) {
        System.out.println("Windows nn deixou escrever");
    }

    try {
        FileReader leitor = new FileReader("jogo.txt");
        int letra;
        while ((letra = leitor.read()) != -1) {
          System.out.print((char) letra);
        }

        System.out.println("\nFim do arquivo");
        leitor.close();

        } catch (IOException e) {
            System.out.println("Windows nn deixou ler");
        }
    }