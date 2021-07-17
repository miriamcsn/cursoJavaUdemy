package exercicios.s09e02.entities;

public class ProductV2 {

    // Classe criada para complementar a classe AdicionarRemoverProdutosV2

    private String name;
    private double price;
    private int quantity;

    // 1. CONSTRUTORES

    public ProductV2() { }

    public ProductV2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public ProductV2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // 2. GETTERS AND SETTERS

    /*
    * Agora que meus atributos da classe Product são do tipo private, eu preciso de métodos
    * GET e SET para, respectivamente, retornar e atribuir valores a esses atributos.
    * */

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // 3. OUTROS MÉTODOS

    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    public void addProducts (int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts (int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return 	name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
