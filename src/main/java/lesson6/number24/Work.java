package main.java.lesson6.number24;

public class Work {
    public static void main(String[] args) {
        Appliances appliances = new Appliances("Sss", 12);
        Washing washing = new Washing("Samsung", 5, 10, 15, 22, 44, 1, 12);
        FoodProcessor foodProcessor = new FoodProcessor("Bosch", 33, true, false, true, true, false);
        appliances.switchOff();
        washing.switchOff();
        foodProcessor.switchOn();


    }
}
