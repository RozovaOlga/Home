package main.java.lesson3;

import main.java.lesson3.Auto;

/**
 * The type main.java.lesson3.Calculator.
 */
class Calculator {
    /**
     * main.java.lesson3.Calculator counts.
     * Calculates which car will drive more
     *
     * @param bus  the bus
     * @param golf the golf
     */
    public static void calculatorCounts(Auto bus, Auto golf) {
        if ((bus.getTankCapacity() / bus.getFuelConsumption()) > (golf.getTankCapacity() / golf.getFuelConsumption())) {
            System.out.println(bus.getName() + " проедет большее расстояние");
        } else if ((bus.getTankCapacity() / bus.getFuelConsumption()) == (golf.getTankCapacity() / golf.getFuelConsumption())) {
            System.out.println(bus.getName() + " и " + golf.getName() + " проедут одинаковые расстояния");

        } else {
            System.out.println(golf.getName() + " проедет большее расстояние");
        }
        /**
         * Calculates which car is older
         */
        if (golf.timestamp.after(bus.timestamp) == true) {
            System.out.println((bus.getName()) + " более старый");
        } else {
            System.out.println((golf.getName()) + " более старый");
        }
    }
}