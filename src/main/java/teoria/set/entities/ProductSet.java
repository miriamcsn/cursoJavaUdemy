package teoria.set.entities;

import java.util.Objects;

public class ProductSet {

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
}
