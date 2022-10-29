package arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //digite o caminho da  pasta
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        //a variavel tipo path pode ser o caminho de um arquivo tanto o caminho de uma pasta
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);//LISTAR SOMENTE O QUE É DIRETORRIO
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
        sc.close();
    }
}
