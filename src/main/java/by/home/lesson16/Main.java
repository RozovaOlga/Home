package by.home.lesson16;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        final List<Cashier> cashiers = new LinkedList<>();
        final Queue<Shopper> shopper = new ConcurrentLinkedQueue<>() ;
        for (int i = 0; i < 10; i++) {
            shopper.add(new Shopper("Покупатель " + (i + 1), Shopper.givenListProducts()));
        }
        for (int i = 0; i < 3; i++) {
            cashiers.add(new Cashier("кассе " + (i + 1), shopper));
        }
    }
}
