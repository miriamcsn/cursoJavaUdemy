package teoria.set;

import teoria.set.entities.ProductSet;

import java.util.HashSet;
import java.util.Set;

public class TestandoIgualdadeComSet {

    public static void main(String[] args) {

        Set<ProductSet> set = new HashSet<>();

        set.add(new ProductSet("TV", 900.0));
        set.add(new ProductSet("Notebook", 1200.0));
        set.add(new ProductSet("Tablet", 400.0));

        ProductSet prod = new ProductSet("Notebook", 1200.0);
        System.out.println(set.contains(prod));
        // false
        // inicialmente deu falso porque são duas instâncias diferentes, ou seja,
        // ele comparou as REFERENCIAS dos dois objetos e concluiu que eles não são iguais.

        // para o contains() funcionar como para as outras classes, precisamos IMPLEMENTAR
        // os métodos hashCode e equals na nossa classe Product.
        // Depois da implementação...
        // true =) -- ou seja, contém esse mesmo objeto dentro do set
    }
}
