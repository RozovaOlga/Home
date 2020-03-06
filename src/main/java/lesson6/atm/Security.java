package main.java.lesson6.atm;

import java.util.Scanner;

/**
 * The type Security.
 */
public final class Security {
    /**
     * Check security.
     * Checking the pin code. If 3 attempts fail - exit the program
     *
     * @param cart the cart
     */
    public static void checkSecurity(Cart cart) {
        int attempt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль (1234)");
        while (attempt < 3) {
            int pin = scanner.nextInt();
            if (pin != cart.getPIN()) {
                attempt++;
                System.out.println("Неправильный PIN");
            } else {
                System.out.println("Здравствуйте!");
                break;
            }
            if (attempt == 3) {
                System.out.println("Карта заблокирована. До свидания");
                System.exit(0);
            }
        }
    }
}