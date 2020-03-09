package main.java.lesson6.number24;

public class Appliances implements OnOff {
    private String manufacturingFirm;
    private int serialNumber;


    public Appliances(String manufacturingFirm, int serialNumber) {
        this.manufacturingFirm = manufacturingFirm;
        this.serialNumber = serialNumber;
    }

    public void switchOn() {
        System.out.println("Вилка в розетке");
    }

    public void switchOff() {
        System.out.println("Вилка не в розетке");
    }

    public String getManufacturingFirm() {
        return manufacturingFirm;
    }

    public void setManufacturingFirm(String manufacturingFirm) {
        this.manufacturingFirm = manufacturingFirm;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
