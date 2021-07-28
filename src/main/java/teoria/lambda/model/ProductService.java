package teoria.lambda.model;

import teoria.set.entities.ProductSet;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<ProductSet> list, Predicate<ProductSet> criteria) {
        double sum = 0.0;
        for (ProductSet p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}