package teoria.lambda;

import teoria.set.entities.ProductSet;

import java.util.ArrayList;
import java.util.List;

public class AprendendoExpressoesLambda01 {
    public static void main(String[] args) {

        List<ProductSet> list = new ArrayList<>();

        list.add(new ProductSet("TV", 900.00));
        list.add(new ProductSet("Notebook", 1200.00));
        list.add(new ProductSet("Tablet", 450.00));

        list.sort(
                (p1, p2) -> p1.getName()
                        .toUpperCase()
                        .compareTo(p2.getName()
                                .toUpperCase()
                        )
        );

        for (ProductSet p : list) {
            System.out.println(p);
        }
    }
}
