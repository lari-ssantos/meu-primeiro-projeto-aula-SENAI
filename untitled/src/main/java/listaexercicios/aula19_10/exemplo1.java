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
        FileWriter escritor = new FileWriter("teste.txt");
        escritor.write("é isso ae");
        System.out.println("frase escrita");
        escritor.close();

    } catch (IOException e) {
        System.out.println("Windows nn deixou escrever");
    }
}