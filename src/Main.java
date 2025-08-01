import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Назва файлу, з яким будемо працювати
        String fileName = "numbers.txt";

        // Створюємо файл і записуємо в нього два числа для прикладу
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("10\n20");
            writer.close();
            System.out.println("Файл 'numbers.txt' успішно створено з числами 10 і 20.");
        } catch (IOException e) {
            System.err.println("Помилка при створенні файлу: " + e.getMessage());
            return;
        }

        // 1. Зчитуємо дані з файлу
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            scanner.close();

            System.out.println("Зчитано числа: " + number1 + " та " + number2);

            // 2. Додаємо числа
            int sum = number1 + number2;
            System.out.println("Сума чисел: " + sum);

            // 3. Записуємо результат назад у файл
            try {
                FileWriter writer = new FileWriter(fileName);
                writer.write(String.valueOf(sum));
                writer.close();
                System.out.println("Результат (" + sum + ") успішно записано у файл.");
            } catch (IOException e) {
                System.err.println("Помилка при записі у файл: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не знайдено: " + e.getMessage());
        }
    }
}