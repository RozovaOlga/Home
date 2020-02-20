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