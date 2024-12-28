// Импортируем класс Scanner для ввода данных с клавиатуры.
import java.util.Scanner;
// Основной класс программы.
public class Main {
    // Точка входа в программу — метод main.
    public static void main(String[] args) {
        // Создаём объект Scanner для считывания данных, введённых пользователем.
        Scanner scanner = new Scanner(System.in);

        // Выводим меню операций, которые может выполнить калькулятор.
        System.out.println("Простой калькулятор!");
        System.out.println("Выберите операцию:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");

        // Считываем выбор пользователя (целое число).
        int operation = scanner.nextInt();

        // Просим пользователя ввести два числа, с которыми будет выполняться операция.
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        // Переменная для хранения результата вычислений.
        double result = 0;

        // Проверяем, какую операцию выбрал пользователь, и выполняем её.
        if (operation == 1) {
            // Если выбрано сложение, складываем два числа.
            result = num1 + num2;
            System.out.println("Результат: " + result);
        } else if (operation == 2) {
            // Если выбрано вычитание, вычитаем второе число из первого.
            result = num1 - num2;
            System.out.println("Результат: " + result);
        } else if (operation == 3) {
            // Если выбрано умножение, перемножаем два числа.
            result = num1 * num2;
            System.out.println("Результат: " + result);
        } else if (operation == 4) {
            // Если выбрано деление, проверяем, чтобы делитель не был равен нулю.
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Результат: " + result);
            } else {
                // Выводим ошибку, если пользователь пытается делить на ноль.
                System.out.println("Ошибка: Деление на ноль невозможно.");
            }
        } else {
            // Если введена некорректная операция, выводим сообщение об ошибке.
            System.out.println("Ошибка: Неверный выбор операции.");
        }

        // Закрываем объект Scanner для освобождения ресурсов.
        scanner.close();
    }
}