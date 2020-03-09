package main.java.lesson6.atm;

/**
 * The type Money transaction.
 */
public final class MoneyTransaction {
    /**
     * The Data operations.
     */
    DataOperations dataOperations = new Storage();

    /**
     * If the ATM can issue the amount - gives it
     * Give boolean.
     *
     * @param giveMoney the give money
     * @param cart      the cart
     * @return the boolean
     */
    public final boolean give(int giveMoney, Cart cart) {
        cart = dataOperations.read(cart);
        boolean resultGive = true;
        int money = giveMoney;
        if (banknoteCheck(money)) {
            cart.setBalance(cart.getBalance() - giveMoney);
            dataOperations.save(cart);
        } else {
            resultGive = false;
        }
        return resultGive;
    }

    /**
     * If the ATM can take the amount - it takes
     * Take boolean.
     *
     * @param takeMoney the take money
     * @param cart      the cart
     * @return the boolean
     */
    public final boolean take(int takeMoney, Cart cart) {
        cart = dataOperations.read(cart);
        boolean resultGive = true;
        int money = takeMoney;
        if (banknoteCheck(money)) {
            cart.setBalance(cart.getBalance() + takeMoney);
            dataOperations.save(cart);
        } else {
            resultGive = false;
        }
        return resultGive;
    }

    /**
     * reads balance from file
     *
     * @param cart the cart
     * @return the int
     */
    public final int readBalance(Cart cart) {
        cart = dataOperations.read(cart);
        return cart.getBalance();
    }

    /**
     * Banknote check boolean.
     * <p>
     * Checks if the ATM can issue or accept the required amount.
     *
     * @param money the money
     * @return the boolean
     */
    public final boolean banknoteCheck(int money) {
        boolean result = true;
        int INF = 1000000000;
        int[] sum = new int[money + 1];
        for (int m = 1; m <= money; m++) {
            sum[m] = INF;
            for (int i = 0; i < Banknotes.getBanknotes().size(); i++) {
                if (m >= Banknotes.getBanknotes().get(i) && sum[m - Banknotes.getBanknotes().get(i)] < sum[m])
                    sum[m] = sum[m - Banknotes.getBanknotes().get(i)] + 1;
            }
        }
        if (sum[money] == INF) {
            result = false;
        }
        return result;
    }
}