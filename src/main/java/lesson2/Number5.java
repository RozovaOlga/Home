package main.java.lesson2; /**
 * Имеется целое число(любое),это число - сумма недег в рублях.
 * Вывести это число,добавив к нему слово "рублей" в правильном падеже
 */

import java.util.Scanner;

public class Number5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько рублей у тебя в кошельке?");
        int rubli = in.nextInt();
        int ostRubli = rubli % 10;
        if (rubli == 1) {
            System.out.println("Ты можешь отдолжить мне " + rubli + " рубль,я обязательно отдам");
        } else if ((rubli >= 2) && (rubli <= 4)) {
            System.out.println("Ты можешь отдолжить мне " + rubli + " рубля,я обязательно отдам");
        } else if ((rubli >= 5) && (rubli <= 20)) {
            System.out.println("Ты можешь отдолжить мне " + rubli + " рублей,я обязательно отдам");
        } else if ((rubli > 20) && (ostRubli == 1)) {
            System.out.println("Ты можешь отдолжить мне " + rubli + " рубль,я обязательно отдам");
        } else if ((rubli > 20) && (ostRubli >= 1) && (ostRubli <= 4)) {
            System.out.println("Ты можешь отдолжить мне " + rubli + " рубля,я обязательно отдам");
        } else if ((rubli > 20) && ((ostRubli >= 5) || (ostRubli == 0))) {
            System.out.println("Ты можешь отдолжить мне " + rubli + " рублей,я обязательно отдам");
        } else if (rubli <= 0) {
            System.out.println("А говорят, что программисты хорошо зарабатывают");
        }
    }
}