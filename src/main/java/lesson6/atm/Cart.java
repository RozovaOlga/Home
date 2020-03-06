package main.java.lesson6.atm;

import java.io.*;

/**
 * The type Cart.
 */
public class Cart implements Serializable {
    private final int PIN;
    private int balance;

    /**
     * Instantiates a new Cart.
     *
     * @param pin     the pin
     * @param balance the balance
     */
    public Cart(int pin, int balance) {
        PIN = pin;
        this.balance = balance;
    }

    /**
     * Gets pin.
     *
     * @return the pin
     */
    public int getPIN() {
        return PIN;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

