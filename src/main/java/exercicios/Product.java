package exercicios;

public class Product {

    // Classe criada para complementar a classe AdicionarRemoverProdutos

    public String name;
    public double price;

    // private: significa que aquele atributo não pode ser acessado por outras classes.

    public int quantity;

    public Product() { }
/*
    construtor padrão. Como diferenciar um construtor de um método?
    Não especificamos qualquer tipo de retorno - que é obrigatório para métodos. É assim que se diferencia.
    como instanciar: Product product = new Product(); -- ou seja, parênteses vazios.
*/

    public Product(String name, double price, int quantity) {
/*
        construtor opção número 1 - sobrecarrega o padrão (OverLoad)
        como instanciar: Product product = new Product("TV", 900.00, 10);
        -- reparar nos parâmetros passados.
*/
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price) {
/*
        construtor opção número 2 - sobrecarrega o padrão (OverLoad)
        como instanciar: Product product = new Product("TV", 900.00);
        -- reparar que não passei a quantidade.
*/
        this.name = name;
        this.price = price;
    }

/*
    ou seja, consigo fazer vários construtores. Por padrão, será o primeiro, mas posso instanciar
    o objeto passando parâmetros tb, usando as opções de construtores 1 e 2 que
    sobrecarregam (overload) o construtor padrão.
*/

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
