package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEBufferedWriter1 {
    public static void main(String[] args) {

        //ele cria o arquivo e todas vez que rodamos ele regrava em  cima
        String[] lines = new String[]{"Serei uma desenvolvedora java Back-End - The BEST", "Serei uma desenvolvedora Front-end - THE BEST"};

        //criar o arquivo
        String path = ("C:\\TEMP\\out.txt");


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            //gravar no arquivo o vetor de String que deini no lines
            for( String line : lines){
                bw.write(line); //esse line por padrão não tem quebra de linha
                bw.newLine();  //por isso defini um newLine
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
