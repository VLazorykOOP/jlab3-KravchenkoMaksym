package Task_1;

public class RegularProduct extends Product {
    private String category;

    public RegularProduct(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Категорія: " + category);
    }
}
