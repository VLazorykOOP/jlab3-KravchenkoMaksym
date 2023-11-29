package Task_1;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Toy("Лего", 50.99, "діти до 10 років");
        products[1] = new DairyProduct("Молоко", 2.49, "01.01.2024");
        products[2] = new RegularProduct("Книга", 20.00, "Література");

        for (Product product : products) {
            product.show();
            System.out.println("------------");
        }
    }
}
