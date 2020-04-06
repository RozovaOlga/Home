package by.home.lesson3;

/**
 * The type Number 11.
 * Имеется целое число, определить является ли это число простым
 */
public class Number11 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(primeNumber(-7));
    }

    /**
     * Count the number of divisions.
     *
     * @param number the number
     * @return the string prime or not prime
     */
    public static String primeNumber(int number) {
        int countDivision = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                countDivision++;
            }
        }
        if (countDivision == 2) {
            return ("this is a prime number");
        } else {
            return ("this is a not prime number");
        }
    }
}
