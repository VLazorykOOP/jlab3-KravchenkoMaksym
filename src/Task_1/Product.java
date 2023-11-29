package Task_1;

public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void show() {
        System.out.println("Товар: " + name);
        System.out.println("Ціна: " + price);
    }
}
