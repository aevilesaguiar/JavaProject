package arquivos;

import java.io.File;
import java.util.Scanner;

public class InformationPathFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //digite o caminho do arquivo
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getName: " + path.getName());
        sc.close();

    }
}
