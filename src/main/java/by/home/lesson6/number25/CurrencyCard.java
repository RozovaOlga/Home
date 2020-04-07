package by.home.lesson6.number25;

public class CurrencyCard extends InternationalCard {
    private int balanceUsd;

    public CurrencyCard(int pin, String name, boolean paymentInEurope, boolean paymentInUSA, int balanceUsd) {
        super(pin, name, paymentInEurope, paymentInUSA);
        this.balanceUsd = balanceUsd;
    }
}
