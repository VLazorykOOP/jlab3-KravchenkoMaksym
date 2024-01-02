package Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних
        Detail[] details = new Detail[3];
        details[0] = new Mechanism("Engine", 5);
        details[1] = new Product("Smartphone", 500.0);
        details[2] = new Node("Sensor", "Proximity");

        // Виведення даних
        for (Detail detail : details) {
            detail.show();
            System.out.println("-------------------------");
        }
    }
}