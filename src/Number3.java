/**
 * Задание 3
 * Создайте число. Определите,является ли последняя цифра числа семеркой
 */

import java.util.Scanner;

public class Number3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое число");
        int number = in.nextInt();
        int ost = number % 10;
        if (ost % 7 == 0) {
            System.out.println("Последняя цифра - 7");
        } else
            System.out.println("Последняя цифра не 7");
    }
}