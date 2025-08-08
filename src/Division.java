class Division implements MathFunction {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Повертаємо NaN (Not a Number) у разі помилки
        }
        return a / b;
    }
}