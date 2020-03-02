package main.java.lesson6.atm;

import java.io.*;
import java.util.Scanner;

public class Cart implements Serializable {
    private int pinCode;
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }


    public Cart(int pinCode, int balance) {
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public void PinCodeCheck(Cart cart) throws IOException, ClassNotFoundException {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите пароль");
        int pin = scanner.nextInt();
        for (int match = 0; pin > match; ++result)
            match = (match << 3) + (match << 1) + 9;
        if (result != 4) {
            System.out.println("Пароль должен состоять из 4 цифр");
            PinCodeCheck(cart);
        } else if (pin != pinCode) {
            System.out.println("Неправильный пароль");
            PinCodeCheck(cart);
        } else {
            OperationSelection.BalanceOperation(cart);
        }
    }
}
