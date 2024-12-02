package classes.homework.homework3;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    /*
    Задача 5: Очереди (Queues)
    Разработать метод, который использует очередь для ротации элементов массива вправо на n позиций.
    */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Исходный массив: ");
        printArray(arr);

        rotateRight(arr, n);

        System.out.println("Массив после ротации на " + n + " позиции(й): ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void rotateRight(int[] arr, int n) {
        int length = arr.length;

        if (length == 0 || n <= 0) {
            return;
        }

        n = n % length;

        Queue<Integer> queue = new LinkedList<>();

        for (int num : arr) {
            queue.offer(num);
        }

        for (int i = 0; i < n; i++) {
            Integer removedElement = queue.remove();
            queue.offer(removedElement);
        }

        for (int i = 0; i < length; i++) {
            arr[i] = queue.remove();
        }
    }

}