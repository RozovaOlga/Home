package main.java.lesson6.number25;

public class BelCard extends LocalCard {
    private int discountsConte;


    public BelCard(int pin, String name, boolean thePossibilityOfCashTransactionsOnline, int discountsConte) {
        super(pin, name, thePossibilityOfCashTransactionsOnline);
        this.discountsConte = discountsConte;
    }
}
