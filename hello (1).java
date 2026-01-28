import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            int result = 100 / number;
            System.out.println("Результат: " + result);
            
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите корректное число!");
            scanner.next();
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно!");
        }
        System.out.println("Программа завершена.");
    }
}