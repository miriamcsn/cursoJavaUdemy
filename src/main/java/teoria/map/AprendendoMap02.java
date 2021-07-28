package teoria.map;

import teoria.set.entities.ProductSet;

import java.util.HashMap;
import java.util.Map;

public class AprendendoMap02 {

    public static void main(String[] args) {
        Map<ProductSet, Double> stock = new HashMap<>();
        ProductSet p1 = new ProductSet("Tv", 900.0);
        ProductSet p2 = new ProductSet("Notebook", 1200.0);
        ProductSet p3 = new ProductSet("Tablet", 400.0);
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        ProductSet ps = new ProductSet("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
