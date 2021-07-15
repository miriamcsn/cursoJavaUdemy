package exercicios;

public class ProductV2 {

    // Classe criada para complementar a classe AdicionarRemoverProdutosV2

    private String name;
    private double price;
    private int quantity;

    // private: significa que aquele atributo não pode ser acessado por outras classes.

    // 1. CONSTRUTORES

    public ProductV2() { }  // construtor padrão. Como diferenciar um construtor de um método?
    // Não especificamos qualquer tipo de retorno - que é obrigatório para métodos. É assim que se diferencia.
    // como instanciar: Product product = new Product(); -- ou seja, parênteses vazios.

    public ProductV2(String name, double price, int quantity) {
        // construtor opção número 1 - sobrecarrega o padrão (OverLoad)
        // como instanciar: Product product = new Product("TV", 900.00, 10); -- reparar nos parâmetros passados.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public ProductV2(String name, double price) {
        // construtor opção número 2 - sobrecarrega o padrão (OverLoad)
        // como instanciar: Product product = new Product("TV", 900.00); -- reparar que não passei a quantidade.
        this.name = name;
        this.price = price;
    }

    // ou seja, consigo fazer vários construtores. Por padrão, será o primeiro, mas posso instanciar
    // o objeto passando parâmetros tb, usando as opções de construtores 1 e 2 que
    // sobrecarregam (overload) o construtor padrão.

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

    public String toString() {  // fiz isso aqui na devtalk com daniel -- override -- não me lembro... :(
        return 	name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
