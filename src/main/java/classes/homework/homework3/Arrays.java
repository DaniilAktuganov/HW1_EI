package classes.homework.homework3;

public class Arrays {

    /*Задача 1: Массивы (Arrays)
    Написать метод, который принимает массив целых чисел и возвращает сумму всех элементов массива.
    */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = sumArray(numbers);
        System.out.println("Сумма элементов массива: " + result);
    }

    public static int sumArray(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}