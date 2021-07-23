package teoria.boundedwildcards;

import teoria.boundedwildcards.entities.Circle;
import teoria.boundedwildcards.entities.Rectangle;
import teoria.boundedwildcards.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class AprendendoCuringasDelimitados {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) { // lista q aceita qq subtipo q extends Shape
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

}
