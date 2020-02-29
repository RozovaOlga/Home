package main.java.lesson6.atm;

import java.util.Arrays;
import java.util.List;

public class Money {
    private static final List<Integer> money = Arrays.asList(20, 50, 100);

    public static List<Integer> getMoney() {
        return money;
    }

}

