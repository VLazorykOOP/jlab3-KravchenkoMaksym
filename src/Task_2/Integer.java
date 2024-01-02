package Task_2;

// Абстрактний клас, що визначає базові арифметичні операції та інші методи для цілих чисел
abstract class Integer {
    protected int[] digits;

    // Абстрактні методи, які будуть реалізовані в підкласах
    public abstract Integer add(Integer other);
    public abstract Integer subtract(Integer other);
    public abstract Integer multiply(Integer other);
    public abstract String toString();
    public abstract boolean equals(Object obj);
}

// Підклас Heximal, що розширює абстрактний клас Integer
class Heximal extends Integer {
    // Конструктор для ініціалізації десяткових розрядів Heximal числа
    public Heximal(int[] digits) {
        this.digits = digits;
    }

    // Реалізація методів абстрактного класу для Heximal числа
    @Override
    public Integer add(Integer other) {
        // Реалізація операції додавання для Heximal
        return null;
    }

    @Override
    public Integer subtract(Integer other) {
        // Реалізація операції віднімання для Heximal
        return null;
    }

    @Override
    public Integer multiply(Integer other) {
        // Реалізація операції множення для Heximal
        return null;
    }

    @Override
    public String toString() {
        // Реалізація методу toString для Heximal
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        // Реалізація методу equals для Heximal
        return false;
    }
}

// Підклас Binary, що розширює абстрактний клас Integer
class Binary extends Integer {
    // Конструктор для ініціалізації десяткових розрядів Binary числа
    public Binary(int[] digits) {
        this.digits = digits;
    }

    // Реалізація методів абстрактного класу для Binary числа
    @Override
    public Integer add(Integer other) {
        // Реалізація операції додавання для Binary
        return null;
    }

    @Override
    public Integer subtract(Integer other) {
        // Реалізація операції віднімання для Binary
        return null;
    }

    @Override
    public Integer multiply(Integer other) {
        // Реалізація операції множення для Binary
        return null;
    }

    @Override
    public String toString() {
        // Реалізація методу toString для Binary
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        // Реалізація методу equals для Binary
        return false;
    }
}