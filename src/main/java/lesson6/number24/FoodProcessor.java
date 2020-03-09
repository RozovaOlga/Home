package main.java.lesson6.number24;

public class FoodProcessor extends SmallAppliances {
    private boolean chopper;
    private boolean juicer;
    private boolean meatGrinder;

    public boolean isChopper() {
        return chopper;
    }

    public void setChopper(boolean chopper) {
        this.chopper = chopper;
    }

    public boolean isJuicer() {
        return juicer;
    }

    public void setJuicer(boolean juicer) {
        this.juicer = juicer;
    }

    public boolean isMeatGrinder() {
        return meatGrinder;
    }

    public void setMeatGrinder(boolean meatGrinder) {
        this.meatGrinder = meatGrinder;
    }


    public FoodProcessor(String manufacturingFirm, int serialNumber, boolean remote, boolean charger, boolean chopper, boolean juicer, boolean meatGrinder) {
        super(manufacturingFirm, serialNumber, remote, charger);
        this.chopper = chopper;
        this.juicer = juicer;
        this.meatGrinder = meatGrinder;

    }
}
