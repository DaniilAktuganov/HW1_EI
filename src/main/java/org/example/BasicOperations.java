package org.example;

import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        /*
        Задача 1: Сложение и вычитание чисел (Базовые операции в Java)
        Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();
        int sum = sum(firstNumber, secondNumber);
        int difference = difference(firstNumber, secondNumber);
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        scanner.close();
    }
    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
