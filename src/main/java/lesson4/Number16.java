package main.java.lesson4;
/**
 * Создать массив, заполнить его случайными элементами,распечатать,перевернуть и снова распечатать
 */

import java.util.Random;

public class Number16 {
    public static void main(String[] args) {
        Random random = new Random();
        int massiv[] = new int[10];
        /**
         *  Fill the new array with random.Print
         */
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
        /**
         * Flip array. Print
         */
        int temp;
        for (int i = 0,j=massiv.length-1; i < massiv.length / 2; i++,j--) {
            temp = massiv[j];
            massiv[j] = massiv[i];
            massiv[i] = temp;
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
    }
}


