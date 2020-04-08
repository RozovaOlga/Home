package by.home.lesson16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cashier> cashiers = new ArrayList<>();
        List<Shopper> shopper = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            cashiers.add(new Cashier("кассе " + (i + 1), shopper));
        }

        for (int i = 0; i < 10; i++) {
            shopper.add(new Shopper("Покупатель " + (i + 1), Shopper.givenListProducts()));
        }
    }
}