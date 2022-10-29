package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProgramLerArquivo {
    public static void main(String[] args) {

        //lendo arquivos classe File e Scanner

        //para dizer que quer uma barra invertida tem que colocar duas barras
        //esse objeto encapsula file, vai encapsular todo o processo de acessar o arquivo e também o caminho desse arquivo
        File file = new File("C:\\TEMP\\int.txt");
        Scanner sc = null;
        try {
            sc=new Scanner(file);
            //para testar se existe uma p´roxima linha no arquivo
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }finally {
            if(sc!=null){
            sc.close();}
        }


    }
}
