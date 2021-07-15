package teoria;

public class Calculator {

    // Classe criada para complementar a aula "AprendendoMetodosEstaticosV2"

    public final double PI = 3.14159;  // colocamos 'final' quando é uma constante

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3.0) / 3.0;
    }

}
