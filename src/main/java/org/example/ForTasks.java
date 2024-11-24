package org.example;

public class ForTasks {
    public static void main(String[] args) {
        /*
        Задача 1: Вывод чисел от 1 до 10 (Задачи на for )
        Напишите программу, которая выводит все числа от 1 до 10.
        */

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print(" ");
            }
        }
    }
}