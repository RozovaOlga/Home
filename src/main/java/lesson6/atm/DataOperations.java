package main.java.lesson6.atm;

/**
 * The interface Data operations.
 */
public interface DataOperations {
    /**
     * Save cart.
     * Read cart.
     *
     * @param cart the cart
     * @return the cart
     */
    Cart save(Cart cart);

    Cart read(Cart cart);
}
