/**
 * есть 2 авто.Даны имена,размер бака и расход на 100км.
 * Вычислить,кто проедет большее расстояние при заправке полного бака.
 * Кто из них старше
 */

public class TaskAuto {
    public static void main(String[] args) {
        Auto bus = new Auto("multivan T6", 50, 5.0);
        Auto golf = new Auto("volkswagen golf 7", 50, 5.0);
        Calculator.calculatorCounts(bus, golf);
        System.out.println(bus.timestamp);
        System.out.println(golf.timestamp);
    }
}



