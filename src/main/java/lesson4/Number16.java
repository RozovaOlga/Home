package main.java.lesson4;
/**
 * Создать массив, заполнить его случайными элементами,распечатать,перевернуть и снова распечатать
 */

import java.util.Random;

public class Number16 {
    public static void main(String[] args) {
        Random random = new Random();
        int mas[] = new int[10];
        /**
         *  Fill the new array with random.Print
         */
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        /**
         * Flip array. Print
         */
        int temp;
        for (int i = 0, j = mas.length - 1; i < mas.length / 2; i++, j--) {
            temp = mas[j];
            mas[j] = mas[i];
            mas[i] = temp;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}


