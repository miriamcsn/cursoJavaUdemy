package exercicios;

public class ProductV3 {

    // Classe criada para complementar a classe AdicionarRemoverProdutosV3
    // gerando constructors, getters, and setters automatically

    private String name;
    private double price;
    private int quantity;

    // CONSTRUTORES - GERADOS AUTOMATICAMENTE

    public ProductV3(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductV3(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public ProductV3() {
    }

    // GETTERS AND SETTERS GERADOS AUTOMATICAMENTE

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    /*
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    comentado porque por uma regra de negócio, não é interessante permitir ao usuario modificar
    a quantidade de produtos no estoque. Ele só é atualizado automaticamente quando alguma operação
    for feita.
    */

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
