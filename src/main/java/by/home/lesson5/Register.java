package by.home.lesson5;

/**
 * The type Register.
 * Привести символы в верхний и нижний регистр, не использовать toUpperCase(toLowerCase)
 */
public class Register {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        String str = "  КостЯ + НатАша = LoVe  ";
        char[] chars = str.toCharArray();
        /**
         *  Uppercase
         */
        for (int i = 0; i < str.length(); i++) {
            if ((chars[i] <= 'я') && (chars[i] >= 'а') || (chars[i] <= 'z') && (chars[i] >= 'a')) {
                chars[i] -= 32;
            }
        }
        str = String.valueOf(chars);
        System.out.println(str);
        /**
         *  lower case
         */
        for (int i = 0; i < str.length(); i++) {
            if ((chars[i] <= 'Я') && (chars[i] >= 'А') || (chars[i] <= 'Z') && (chars[i] >= 'A')) {
                chars[i] += 32;
            }
        }
        str = String.valueOf(chars);
        System.out.println(str);
    }
}
