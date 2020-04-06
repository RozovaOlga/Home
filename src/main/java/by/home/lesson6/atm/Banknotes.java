package by.home.lesson6.atm;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Banknotes.
 */
public class Banknotes {
    private static List<Integer> banknotes = new ArrayList<>();

    /**
     * Gets banknotes.
     *
     * @return the banknotes
     */
    public static List<Integer> getBanknotes() {
        return banknotes;
    }

    static {
        banknotes.add(20);
        banknotes.add(50);
        banknotes.add(100);
    }
}
