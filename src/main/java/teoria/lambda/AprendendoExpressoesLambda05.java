package teoria.lambda;

import teoria.lambda.model.ProductService;
import teoria.set.entities.ProductSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AprendendoExpressoesLambda05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<ProductSet> list = new ArrayList<>();

        list.add(new ProductSet("Tv", 900.00));
        list.add(new ProductSet("Mouse", 50.00));
        list.add(new ProductSet("Tablet", 350.50));
        list.add(new ProductSet("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }

}
