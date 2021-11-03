package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    //construtor padrão
    public Product() {

    }

    //construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //construtor sobrecarga
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //gets e sets
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

    //quantity só com get para proteger a entrada de dados na aplicação
    public int getQuantity() {
        return quantity;
    }

    //métodos:
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
