package main.java.lesson4.String;

/**
 * Перевернуть строку
 */

public class Stroka {
    public static void main(String[] args) {
        String string="Hello";
        /**
         * Create an array of string characters
         */
        char[] massivChar = string.toCharArray();
        /**
         * Flip Array. Print
         */
        char temp;
        for (int i = 0,j=string.length()-1; i < massivChar.length / 2; i++,j--) {
            temp = massivChar[j];
            massivChar[j] = massivChar[i];
            massivChar[i] = temp;
        }
        System.out.println(massivChar);
    }

    }

