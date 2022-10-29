package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProgramBufferEFileReader {
    public static void main(String[] args) {

        //abri e fechar manualmente as streams

        String path = ("C:\\TEMP\\int.txt");
        FileReader fr = null;
        BufferedReader br = null;

        try{
            //estou estabelecendo uma sequencia de leitura a partir do arquivo path que estiver nesse caminho
            fr=new FileReader(path);
            //O BufferedReader() é instanciado  a partir do FileReader, ele é uma abstração maior
            br = new BufferedReader(fr);

            //o ReadLine ler a linha do arquivo se o arquivo estiver no final o ReadLine retorna nulo.
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line=br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Error: "+e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("Error: "+e.getMessage());
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr!= null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
