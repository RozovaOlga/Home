package by.home.lesson3.busGolf;

import java.sql.Timestamp;

/**
 * The type main.java.by.home.lesson3.Auto.Auto.
 */
class Auto {

    private String name;
    private int tankCapacity;
    private double fuelConsumption;
    /**
     * The Timestamp.
     */
    Timestamp timestamp;

    /**
     * Instantiates a new main.java.by.home.lesson3.Auto.Auto.
     *
     * @param name            the name
     * @param tankCapacity    the tank capacity
     * @param fuelConsumption the fuel consumption
     */
    public Auto(String name, int tankCapacity, double fuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.timestamp = new Timestamp(System.nanoTime());
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets tank capacity.
     *
     * @param tankCapacity the tank capacity
     */
    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    /**
     * Gets tank capacity.
     *
     * @return the tank capacity
     */
    public int getTankCapacity() {
        return tankCapacity;
    }

    /**
     * Sets fuel consumption.
     *
     * @param fuelConsumption the fuel consumption
     */
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Gets fuel consumption.
     *
     * @return the fuel consumption
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }
}