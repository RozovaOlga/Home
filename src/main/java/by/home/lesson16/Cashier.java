package by.home.lesson16;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Cashier extends Thread {
    static final DateFormat time = new SimpleDateFormat("HH:mm:ss");
    private final List<Shopper> shopperQueue;

    public Cashier(String name, List<Shopper> shopperQueue) {
        super(name);
        this.shopperQueue = shopperQueue;
        start();
    }


    @Override
    public void run() {
        while (true) {
            try {
                Shopper shopper;
                synchronized (shopperQueue) {
                    shopperQueue.wait(2000);
                    if (shopperQueue.size() == 0) {
                        break;
                    }
                    shopper = shopperQueue.remove(0);
                    shopperQueue.notify();
                }
                times(shopper.getName() + " начал обслуживаться на  " + this);
                Thread.sleep(2000 * shopper.getProductsInTheBasket().size());
                times(shopper.getName() + " купил " + shopper.getProductsInTheBasket().toString() + " на " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
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
