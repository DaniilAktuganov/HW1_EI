package classes.homework.homework3;

public class Strings {

    /*
    Задача 2: Строки (Strings)
    Создать функцию, которая принимает строку и возвращает её в обратном порядке.
    */

    public static void main(String[] args) {
        String text = "акортС";
        String result = reverseString(text);
        System.out.println(result);
    }

    public static String reverseString(String inputString) {
        StringBuilder reversed = new StringBuilder(inputString);
        return reversed.reverse().toString();
    }
}