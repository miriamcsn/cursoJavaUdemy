package teoria.set.entities;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class ProductTreeSet implements Comparable<ProductTreeSet> {

    private String name;
    private Double price;

    public ProductTreeSet(String name, Double price) {
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
    public String toString() {
        return "ProductTreeSet{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(@NotNull ProductTreeSet o) {
        return name.toUpperCase(Locale.ROOT).compareTo(o.getName().toUpperCase(Locale.ROOT));
    }
}
