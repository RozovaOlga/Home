package main.java.lesson6.atm;

import java.util.Scanner;

public class Security {
    public static boolean checkSecurity(Cart cart) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите пароль (1234)");
        int pin = scanner.nextInt();
        for (int match = 0; pin > match; ++result)
            match = (match << 3) + (match << 1) + 9;
        if (result != 4) {
            System.out.println("Пароль должен состоять из 4 цифр");
            return false;
        } else if (pin != cart.getPinCode()) {
            System.out.println("Неправильный пароль");
            return false;
        }
        return true;
    }
}

