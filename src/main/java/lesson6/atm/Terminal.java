package main.java.lesson6.atm;


import java.io.IOException;

public class Terminal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cart cart = new Cart(1234, 2000);
        cart.PinCodeCheck(cart);
    }
}
