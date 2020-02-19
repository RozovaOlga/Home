/**
 * есть 2 авто.Даны имена,размер бака и расход на 100км.
 * Вычислить,кто проедет большее расстояние при заправке полного бака.
 * Кто из них старше
 */

import java.sql.Timestamp;
import java.util.Scanner;

public class AutoTask {
    public static void main(String[] args) {
        Auto bus = new Auto("multivan T6", 50, 5.0);
        Scanner in=new Scanner(System.in);
        System.out.println("Я ненавижу эту задачу");
        Auto golf = new Auto("volkswagen golf 7", 50, 5.0);
        Calculator.calculatorCounts(bus, golf);
    }
}

class Auto {

    private String name;
    private int tankCapacity;
    private double fuelConsumption;
    Timestamp timestamp;

    public Auto(String name, int tankCapacity, double fuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}

class Calculator {
    public static void calculatorCounts(Auto bus, Auto golf) {
        if ((bus.getTankCapacity() / bus.getFuelConsumption()) > (golf.getTankCapacity() / golf.getFuelConsumption())) {
            System.out.println(bus.getName() + " проедет большее расстояние");
        } else if ((bus.getTankCapacity() / bus.getFuelConsumption()) == (golf.getTankCapacity() / golf.getFuelConsumption())) {
            System.out.println(bus.getName() + " и " + golf.getName() + " проедут одинаковые расстояния");

        } else {
            System.out.println(golf.getName() + " проедет большее расстояние");
        }
        if (golf.timestamp.after(bus.timestamp) == true) {
            System.out.println((bus.getName()) + " более старый");
        } else {
            System.out.println((golf.getName()) + " более старый");
        }
    }
}

