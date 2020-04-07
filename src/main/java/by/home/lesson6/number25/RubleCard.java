package by.home.lesson6.number25;

public class RubleCard extends InternationalCard {
    private int balanceByn;

    public RubleCard(int pin, String name, boolean paymentInEurope, boolean paymentInUSA, int balanceByn) {
        super(pin, name, paymentInEurope, paymentInUSA);
        this.balanceByn = balanceByn;
    }
}
