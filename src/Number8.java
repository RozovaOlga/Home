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
        System.out.println(calculateFactorial(20));
    }

    /**
     * Counts the factorial of a number.
     *
     * @param number the number
     * @return the factorial
     */
    public static long calculateFactorial(int number) {
        long factorial = 1;
        while (number > 1) {
            factorial *= number;
            number -= 1;
        }
        return
                factorial;
    }
}

