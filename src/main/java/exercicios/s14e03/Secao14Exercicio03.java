package exercicios.s14e03;

import exercicios.s14e03.entities.Circle;
import exercicios.s14e03.entities.Rectangle;
import exercicios.s14e03.entities.Shape;
import exercicios.s14e03.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Secao14Exercicio03 {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            System.out.printf("Shape #%d data:%n", i);
            System.out.print("Rectangle or Circle (r/c): ");
            char option = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (option == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));

            } else if (option == 'c') {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");

        for (Shape s : list) {
            System.out.println(String.format("%.2f",s.area()));
        }

        sc.close();
    }
}
