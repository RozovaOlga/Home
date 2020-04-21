package by.home.lesson16;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Cashier extends Thread {
    static final DateFormat time = new SimpleDateFormat("HH:mm:ss");
    private Queue<Shopper> shopperQueue;

    public Cashier(String name, Queue<Shopper> shopperQueue) {
        super(name);
        this.shopperQueue = shopperQueue;
        start();
    }


    @Override
    public void run() {
        while (true) {
            try {
                sleep(10000);
                Shopper shopper;
                if ((shopperQueue != null) && (shopperQueue.peek() != null)) {
                    shopper = shopperQueue.poll();
                    if (shopper != null) {
                        times(shopper.getName() + " начал обслуживаться на  " + this);
                        Thread.sleep(200 * shopper.getProductsInTheBasket().size());
                        times(shopper.getName() + " купил " + shopper.getProductsInTheBasket().toString() + " на " + this);
                    }
                } else break;
            } catch (InterruptedException e) {
                System.out.println("упссс");
            }
        }
    }

    @Override
    public String toString() {
        return getName();
    }

    static void times(String s) {
        System.out.println(time.format(new Date()) + " " + s);
    }
}