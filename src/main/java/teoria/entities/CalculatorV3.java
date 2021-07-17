package teoria.entities;

public class CalculatorV3 {

    /*
     * Nessa versão, a classe Calculator tem apenas métodos e funções estáticas,
     * que não precisam (nem mesmo podem) ser instanciadas para serem utilizadas.
     * Para utiliza-los, basta chamar a CLASSE no programa principal (ver AprendendoMetodosEstaticosV3).
     * */

    // Classe criada para complementar a aula "AprendendoMetodosEstaticosV3"

    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3.0) / 3.0;
    }

}