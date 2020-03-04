package main.java.lesson6.atm;

import java.io.*;

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

}
