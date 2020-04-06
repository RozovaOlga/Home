package by.home.lesson3;

import java.math.BigInteger;

/**
 * The type Number 8.
 * Рассчитать факториал числа
 */
public class Number8 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.calculateFactorial(-2);
    }

    /*
     * The type Factorial.
     */
    static class Factorial {
        /**
         * main.java.by.home.lesson2.Home.Calculate factorial.
         * Checks a negative number or not.
         * Counts the factorial of a number.
         *
         * @param number the number
         */
        public void calculateFactorial(int number) {
            BigInteger factorialNumber = BigInteger.valueOf(1);

            if (number < 1) {
                System.out.println("factorial cannot be counted");
            } else {
                while (number > 1) {
                    BigInteger number2 = BigInteger.valueOf(number);
                    factorialNumber = factorialNumber.multiply(number2);
                    number -= 1;
                }
                System.out.println(factorialNumber);
            }
        }
    }
}



