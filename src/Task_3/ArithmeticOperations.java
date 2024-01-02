package Task_3;
// Інтерфейс, що визначає базові арифметичні операції
interface ArithmeticOperations {
    Integer add(Integer other);
    Integer subtract(Integer other);
    Integer multiply(Integer other);
}

// Клас, що представляє ціле число з масивом десяткових розрядів
class Integer {
    protected int[] digits;

    // Конструктор для ініціалізації десяткових розрядів числа
    public Integer(int[] digits) {
        this.digits = digits;
    }
}

// Підклас Heximal, який розширює клас Integer та реалізує інтерфейс ArithmeticOperations
class Heximal extends Integer implements ArithmeticOperations {
    // Конструктор для ініціалізації десяткових розрядів Heximal числа
    public Heximal(int[] digits) {
        super(digits);
    }

    // Реалізація методів інтерфейсу ArithmeticOperations для Heximal числа
    @Override
    public Integer add(Integer other) {
        // Реалізація операції додавання для Heximal
        // ...
        return null;
    }

    @Override
    public Integer subtract(Integer other) {
        // Реалізація операції віднімання для Heximal
        // ...
        return null;
    }

    @Override
    public Integer multiply(Integer other) {
        // Реалізація операції множення для Heximal
        // ...
        return null;
    }

    // Перевизначення методу toString для Heximal
    @Override
    public String toString() {
        // Реалізація методу toString для Heximal
        // ...
        return null;
    }

    // Перевизначення методу equals для Heximal
    @Override
    public boolean equals(Object obj) {
        // Реалізація методу equals для Heximal
        // ...
        return false;
    }
}

// Підклас Binary, який розширює клас Integer та реалізує інтерфейс ArithmeticOperations
class Binary extends Integer implements ArithmeticOperations {
    // Конструктор для ініціалізації десяткових розрядів Binary числа
    public Binary(int[] digits) {
        super(digits);
    }

    // Реалізація методів інтерфейсу ArithmeticOperations для Binary числа
    @Override
    public Integer add(Integer other) {
        // Реалізація операції додавання для Binary
        // ...
        return null;
    }

    @Override
    public Integer subtract(Integer other) {
        // Реалізація операції віднімання для Binary
        // ...
        return null;
    }

    @Override
    public Integer multiply(Integer other) {
        // Реалізація операції множення для Binary
        // ...
        return null;
    }

    // Перевизначення методу toString для Binary
    @Override
    public String toString() {
        // Реалізація методу toString для Binary
        // ...
        return null;
    }

    // Перевизначення методу equals для Binary
    @Override
    public boolean equals(Object obj) {
        // Реалізація методу equals для Binary
        // ...
        return false;
    }
}