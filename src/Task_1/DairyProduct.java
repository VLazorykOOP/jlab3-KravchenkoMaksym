package Task_1;

public class DairyProduct extends Product {
    private String expirationDate;

    public DairyProduct(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Термін придатності: " + expirationDate);
    }
}
