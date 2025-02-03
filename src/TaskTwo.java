import java.util.Scanner;

public class TaskTwo
{
    //TODO Задача 2: Определение максимума из двух чисел
    // Напишите программу, которая сравнивает два введенных числа
    // и выводит наибольшее из них с использованием тернарного оператора
    // Тест ввода:
    // Введите первое число: 7
    // Введите второе число: 5
    // Ожидаемый вывод:
    // Наибольшее число - 7
    public static void main(String[] args)
    {
        int firstNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();
        String answer = (firstNumber > secondNumber)? "The largest number is - " + firstNumber : "The largest number is - " + secondNumber;
        System.out.println(answer);
    }
}
