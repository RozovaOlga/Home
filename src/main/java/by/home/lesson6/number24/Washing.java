package by.home.lesson6.number24;

public class Washing extends LargeAppliances {
    private int linenWeight;
    private int rpm;

    public Washing(String manufacturingFirm, int serialNumber, int weight, int width, int height, int length, int linenWeight, int rpm) {
        super(manufacturingFirm, serialNumber, weight, width, height, length);
        this.linenWeight = linenWeight;
        this.rpm = rpm;
    }

    public int getLinenWeight() {
        return linenWeight;
    }

    public void setLinenWeight(int linenWeight) {
        this.linenWeight = linenWeight;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
