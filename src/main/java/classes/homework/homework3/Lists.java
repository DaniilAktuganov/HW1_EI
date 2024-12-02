package classes.homework.homework3;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    /*
    Задача 3: Списки (Lists)
    Разработать метод, который принимает список целых чисел и удаляет из него все четные числа.
    */

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = removeEvenNumbers(numbers);
        System.out.println(result);
    }

    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}
