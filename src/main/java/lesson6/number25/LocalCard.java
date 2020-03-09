package main.java.lesson6.number25;

public class LocalCard extends Card {
    private boolean thePossibilityOfCashTransactionsOnline;

    public LocalCard(int pin, String name, boolean thePossibilityOfCashTransactionsOnline) {
        super(pin, name);
        this.thePossibilityOfCashTransactionsOnline = thePossibilityOfCashTransactionsOnline;
    }
}
