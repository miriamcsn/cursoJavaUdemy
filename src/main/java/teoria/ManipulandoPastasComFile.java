package teoria;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath); // pode ser tanto o caminho de um arquivo como de uma pasta

        // criar um array com todos os caminhos de pastas do diretório informado:

        File[] folders = path.listFiles(File::isDirectory);
        // :: abre métodos da classe // isDirectory pega os caminhos de cada pasta dentro do path

        System.out.println("FOLDERS: ");

        for (File folder : folders) {
            System.out.println(folder);
        }

        // criar um array com todos os caminhos de arquivos contidos no diretório informado:

        File[] files = path.listFiles(File::isFile);

        System.out.println("FILES: ");

        for (File file : files) {
            System.out.println(file);
        }

        // criar uma subpasta dentro da pasta que eu informei

        boolean success = new File(strPath + "/subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        // se o diretório q eu to tentando criar já existir,
        // ele não consegue criar outro homônimo sobrescrevendo o primeiro,
        // e vai retornar false



        // obter informações do caminho do arquivo ou diretorio que eu passar

        System.out.print("Enter a file path: ");
        String strPath2 = sc.nextLine();

        File path2 = new File(strPath2);
        System.out.println("File name: " + path2.getName());
        System.out.println("Parent directory: " + path2.getParent());
        System.out.println("Complete path: " + path2.getPath());

        sc.close();

    }
}
