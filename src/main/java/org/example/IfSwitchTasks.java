package org.example;

import java.util.Scanner;

public class IfSwitchTasks {
    public static void main(String[] args) {
        /*
        Задача 1: Проверка чётности числа (Задачи на if и switch).
        Напишите программу, которая проверяет, является ли число чётным или нечётным.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        String result = isEvenOrOdd(number);
        System.out.println("Результат: " + result);
        scanner.close();
    }
        public static String isEvenOrOdd(int number) {
            if (number % 2 == 0) {
                return "Чётное";
            } else {
                return "Нечётное";
            }
        }
}