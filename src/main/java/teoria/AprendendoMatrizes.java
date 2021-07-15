package teoria;

import java.util.Locale;
import java.util.Scanner;

public class AprendendoMatrizes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type an integer number that will be the quadratic matrix's size: ");
        Integer n = scanner.nextInt();

        Integer[][] matrix = new Integer[n][n];

        Integer count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {  // cada linha da matriz é um vetor. O número de posicoes do vetor é o numero de colunas da sua matriz, que esta sendo obtido pelo matrix[i].length
                System.out.printf("Line %d, column %d. Type the value you want to add: ", i, j);
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] < 0) count++;
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.printf("%nNegative numbers: %d%n", count);

        scanner.close();
    }
}
