package main.java.lesson6.number24;

/**
 * Создать иерархию классов,описывающих бытовую технику.
 * Создать несколько объектов описанных классов,часть их них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня
 */
public class ProgramLaunch {
    public static void main(String[] args) {
        Appliances appliances = new Appliances("Sss", 12);
        Washing washing = new Washing("Samsung", 5, 10, 15, 22, 44, 1, 12);
        FoodProcessor foodProcessor = new FoodProcessor("Bosch", 33, true, false, true, true, false);
        appliances.switchOff();
        washing.switchOff();
        foodProcessor.switchOn();


    }
}
