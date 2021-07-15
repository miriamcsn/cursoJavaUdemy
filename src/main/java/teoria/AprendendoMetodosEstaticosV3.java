package teoria;

import java.util.Locale;
import java.util.Scanner;

public class AprendendoMetodosEstaticosV3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = CalculatorV3.circumference(radius);
        double v = CalculatorV3.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", CalculatorV3.PI);

        sc.close();
    }

}
