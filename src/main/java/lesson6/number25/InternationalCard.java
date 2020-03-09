package main.java.lesson6.number25;

public class InternationalCard extends Card {
    private boolean paymentInEurope;
    private boolean paymentInUSA;

    public InternationalCard(int pin, String name, boolean paymentInEurope, boolean paymentInUSA) {
        super(pin, name);
        this.paymentInEurope = paymentInEurope;
        this.paymentInUSA = paymentInUSA;
    }
}
