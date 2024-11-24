package org.example;

public class NestedLoopsTasks {
    public static void main(String[] args) {

        /*
        Задача 1: Таблица умножения (Задачи на вложенные циклы).
        Выведите таблицу умножения от 1 до 10
        */

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " х " + j + " = " + result);
            }
        }
    }
}