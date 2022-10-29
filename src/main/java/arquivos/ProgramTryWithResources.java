package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class ProgramTryWithResources {
    public static void main(String[] args) {

        //jeito mais fácil para ler os arquivos

        String path = ("C:\\TEMP\\int.txt");


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            //o ReadLine ler a linha do arquivo se o arquivo estiver no final o ReadLine retorna nulo.
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Error: " + e.getMessage());


        }
    }
}
