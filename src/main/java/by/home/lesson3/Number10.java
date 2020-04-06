package by.home.lesson3;

/**
 * The type Number 10.
 * Имеется целое число.Посчитать сумму цифр данного числа
 */
public class Number10 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(sumNumber(-111));
    }

    /**
     * Counts the sum of numbers
     *
     * @param number the number
     * @return the sum of numbers
     */
    public static int sumNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return Math.abs(sum);
    }
}