package teoria.set.entities;

import java.util.Objects;

public class ProductSet {  // to reaproveitando essa classe pra um monte de programas aqui da teoria

    private String name;
    private Double price;

    public ProductSet(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSet productSet = (ProductSet) o;
        return name.equals(productSet.name) && price.equals(productSet.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    public static boolean staticProductPredicate(ProductSet p) {
        return p.getPrice() >= 100.0;
    }

    public boolean nonStaticProductPredicate() {
        return price >= 100.0;
    }

}
