class Division implements MathFunction {
    public double calculate(double a, double b) {
        if (b == 0) {
            System.out.println("Помилка: Ділення на 0 неможливе.");
            return Double.NaN;
        }
        return a / b;
    }
}