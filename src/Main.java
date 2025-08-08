import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Отримання двох чисел від користувача
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Створення об'єктів для математичних операцій
        MathFunction adder = new Addition();
        MathFunction subtractor = new Subtraction();
        MathFunction multiplier = new Multiplication();
        MathFunction divider = new Division();

        // Виконання операцій та виведення результатів
        System.out.println("--------------------");
        System.out.println("Addition: " + adder.calculate(num1, num2));
        System.out.println("Subtraction: " + subtractor.calculate(num1, num2));
        System.out.println("Multiplication: " + multiplier.calculate(num1, num2));
        System.out.println("Division: " + divider.calculate(num1, num2));

        scanner.close();
    }
}