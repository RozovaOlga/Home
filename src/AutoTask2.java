/**
 * есть 2 авто.Даны имена,размер бака и расход на 100км.
 * Вычислить,кто проедет большее расстояние при заправке полного бака.
 * Кто из них старше
 */
import java.util.ArrayList;

public class AutoTask2 {

    public static void main(String[] args) {
        ArrayList<Auto1> allCars = new ArrayList<>();
        Auto1 bus = new Auto1("multivan T6", 60, 5.0);
        allCars.add(bus);
        Auto1 golf = new Auto1("volkswagen golf 7", 70, 5.0);
        allCars.add(golf);
        Calculator1.calculatorCounts(bus, golf);
        Calculator1.calcul(bus, golf, allCars);
    }
}

class Auto1 {

    private String name;
    private int tankCapacity;
    private double fuelConsumption;

    public Auto1(String name, int tankCapacity, double fuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
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

class Calculator1 {
    public static void calculatorCounts(Auto1 bus, Auto1 golf) {
        if ((bus.getTankCapacity() / bus.getFuelConsumption()) > (golf.getTankCapacity() / golf.getFuelConsumption())) {
            System.out.println(bus.getName() + " проедет большее расстояние");
        } else if ((bus.getTankCapacity() / bus.getFuelConsumption()) == (golf.getTankCapacity() / golf.getFuelConsumption())) {
            System.out.println(bus.getName() + " и " + golf.getName() + " проедут одинаковые расстояния");
        } else {
            System.out.println(golf.getName() + " проедет большее расстояние");
        }
    }

    public static void calcul(Auto1 bus, Auto1 golf, ArrayList<Auto1> allCars) {
        if ((allCars.indexOf(bus)) > (allCars.indexOf(golf))) {
            System.out.println(golf.getName() + " более старый");
        } else if ((allCars.indexOf(bus)) < (allCars.indexOf(golf))) {
            System.out.println((bus.getName() + " более старый"));
        }
    }
}


