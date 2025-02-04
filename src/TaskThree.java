import java.util.Scanner;

public class TaskThree
{
    //TODO Задача 3: Проверка числа с помощью логических операторов
    // Описание задачи: Напишите программу, которая проверяет,
    // делится ли введенное пользователем число нацело на 2 и 5 или на 3 и 7.
    // Тест ввода:
    // Введите число: 21
    // Ожидаемый вывод:
    // Число 21 делится.
    public static void main(String[] args)
    {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String answer = ((number % 2 == 0 && number % 5 == 0) || (number % 3 == 0 && number % 7 == 0))
        ? "The number " + number + " is divisible."
        : "The number " + number + " is not divisible.";
        System.out.println(answer);
    }
}
