import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввід числе
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        MathFunction adder = new Add();
        MathFunction subtractor = new Subtraction();
        MathFunction multiplier = new Multiplication();
        MathFunction divider = new Division();

        // Результат
        System.out.println("--------------------");
        System.out.println("Результат Додавання: " + adder.calculate(a, b));
        System.out.println("Результат Віднімання: " + subtractor.calculate(a, b));
        System.out.println("Результат Множення: " + multiplier.calculate(a, b));
        System.out.println("Результат Ділення: " + divider.calculate(a, b));

        scanner.close();
    }
}