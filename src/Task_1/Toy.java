package Task_1;

public class Toy extends Product {
    private String ageGroup;

    public Toy(String name, double price, String ageGroup) {
        super(name, price);
        this.ageGroup = ageGroup;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Група віку: " + ageGroup);
    }
}
