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
        factorial.calculateFactorial(-4);
    }

    /**
     * The type Factorial.
     */
    static class Factorial {
        /**
         * Calculate factorial.
         * Checks a negative number or not.
         * Counts the factorial of a number.
         *
         * @param number the number
         */
        public void calculateFactorial(int number) {
            long factorialNumber = 1;
            if (number < 1) {
                System.out.println("factorial cannot be counted");
            } else {
                while (number > 1) {
                    factorialNumber *= number;
                    number -= 1;
                }
                System.out.println(factorialNumber);
            }
        }
    }
}



