package by.home.lesson6.atm;

public class Terminal {
    public static void main(String[] args) {
        Cart cart = new Cart(1234, 2000);
        OperationSelection.balanceOperation(cart);
    }
}