package exercicios.s10e03;

import java.util.Locale;
import java.util.Scanner;

public class Secao10ExercicioFixacao03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a positive integer number that will be the number of LINES of the matrix: ");
        Integer lines = scanner.nextInt();

        while (lines <= 0) {
            System.out.print("You are typing zero or a negative integer value. Try again: ");
            lines = scanner.nextInt();
        }

        System.out.print("Type a positive integer number that will be the number of COLUMNS of the matrix: ");
        Integer columns = scanner.nextInt();

        while (columns <= 0) {
            System.out.print("You are typing zero or a negative integer value. Try again: ");
            columns = scanner.nextInt();
        }

        Integer[][] matrix = new Integer[lines][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Line %d, column %d. Type the value you want to add: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer);
            }
            System.out.println();
        }

        System.out.print("Type a value that belongs to the matrix: ");
        Integer number = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j].equals(number)) {
                    System.out.printf("Position: %d, %d%n", i, j);

                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }

                    if (i > 0) {
                        System.out.println("Up: " + matrix[i-1][j]);
                    }

                    if (j < matrix[i].length-1) {
                        System.out.println("Right: " + matrix[i][j+1]);
                    }

                    if (i < matrix.length-1) {
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }
    }
}
