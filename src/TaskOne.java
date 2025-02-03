import java.util.Scanner;

public class TaskOne
{
    //TODO Задача 1: Проверка четности числа
    // Описание задачи: Напишите программу, которая проверяет,
    // является ли введенное пользователем число четным или нечетным, с помощью тернарного оператора.
    // Тест ввода: Введите число: 7
    // Ожидаемый вывод: Число - нечетное.

    public static void main(String[] args)
    {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = (number % 2 != 0) ? "The number is odd" : "The number is even";
        System.out.println(result);
    }
}
