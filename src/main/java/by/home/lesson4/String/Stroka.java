package by.home.lesson4.String;

/**
 * Перевернуть строку
 */

public class Stroka {
    public static void main(String[] args) {
        String string = "Hello";
        /**
         * Create an array of string characters
         */
        char[] charString = string.toCharArray();
        /**
         * Flip Array. Print
         */
        char temp;
        int j = string.length() - 1;
        for (int i = 0; i < charString.length / 2; i++, j--) {
            temp = charString[j];
            charString[j] = charString[i];
            charString[i] = temp;
        }
        System.out.println(charString);
    }
}

