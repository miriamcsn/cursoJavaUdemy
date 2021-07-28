package teoria.lambda;

import teoria.set.entities.ProductSet;

import java.util.ArrayList;
import java.util.List;

public class AprendendoExpressoesLambda02Predicate {

    public static void main(String[] args) {

        List<ProductSet> list = new ArrayList<>();

        list.add(new ProductSet("Tv", 900.00));
        list.add(new ProductSet("Mouse", 50.00));
        list.add(new ProductSet("Tablet", 350.50));
        list.add(new ProductSet("HD Case", 80.90));

        double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min); // inline

        for (ProductSet p : list) {
            System.out.println(p);
        }
    }

}
