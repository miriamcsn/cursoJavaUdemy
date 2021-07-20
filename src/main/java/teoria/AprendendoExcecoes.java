package teoria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AprendendoExcecoes {

    public static void main(String[] args) {

        // quando tratamos as exceções, elas serão mostradas ao usuário
        // e o programa não vai parar a execução.

        method1();
        System.out.println("End of program!");

    }

    public static void method1() {
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");

    }


        public static void method2() {

        System.out.println("*** METHOD2 START ***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position...");
            e.printStackTrace();
            // ajuda a entender o que está acontecendo.
            // aqui mandei printar mas pode atribuir a uma string tb (ex: log)
            sc.next();
            // coloquei isso aqui só pra esperar eu
            // digitar algo e dar tempo de ler o stacktrace
        }
        catch (InputMismatchException e) {
            System.out.println("Input error...");
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
        System.out.println("*** METHOD2 END ***");
    }
}
