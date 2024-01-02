package Task_1;

import java.util.Scanner;

// Суперклас
// Суперклас, представляє загальні характеристики для всіх деталей
class Detail {
    protected String name;

    // Конструктор для ініціалізації назви деталі
    public Detail(String name) {
        this.name = name;
    }

    // Метод для виведення інформації про деталь
    public void show() {
        System.out.println("Detail: " + name);
    }
}

// Підклас, розширює функціональність суперкласу Detail
class Mechanism extends Detail {
    protected int complexity;

    // Конструктор для ініціалізації назви і складності механізму
    public Mechanism(String name, int complexity) {
        super(name);
        this.complexity = complexity;
    }

    // Перевизначений метод для виведення інформації про механізм
    @Override
    public void show() {
        super.show();
        System.out.println("Complexity: " + complexity);
    }
}

// Підклас, розширює функціональність суперкласу Detail
class Product extends Detail {
    protected double price;

    // Конструктор для ініціалізації назви і ціни продукту
    public Product(String name, double price) {
        super(name);
        this.price = price;
    }

    // Перевизначений метод для виведення інформації про продукт
    @Override
    public void show() {
        super.show();
        System.out.println("Price: " + price);
    }
}

// Підклас, розширює функціональність суперкласу Detail
class Node extends Detail {
    protected String type;

    // Конструктор для ініціалізації назви і типу вузла
    public Node(String name, String type) {
        super(name);
        this.type = type;
    }

    // Перевизначений метод для виведення інформації про вузол
    @Override
    public void show() {
        super.show();
        System.out.println("Type: " + type);
    }
}
