package teoria;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AprendendoVetores01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Type the number of heights to be read: ");
        int n = scanner.nextInt();

        double[] vector = new double[n];

        double sum = 0.0;
        for (int i=0; i<n; i++) {

            System.out.printf("Type the height nº %d: ", i);
            vector[i] = readDouble(scanner);

            System.out.printf("Vector in position %d is %.2f.%n", i, vector[i]);
            sum += vector[i];
        }
        double avg = sum / n;
        System.out.printf("The sum of all heights typed is %.2f and the average is %.2f.%n", sum, avg);
        scanner.close();
    }

    public static double readDouble(Scanner sc) {
        double d = 0d;
        while (d == 0d) {
            try {
                d = sc.nextDouble();
            }
            catch (InputMismatchException ex) {
                System.out.print("Invalid numeric value. Type again: ");
                sc.nextLine();
            }
        }
        return d;
    }
}
