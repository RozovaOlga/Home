package by.home.lesson6.number24;

public class SmallAppliances extends Appliances {
    private boolean remote;
    private boolean charger;

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }

    public boolean isCharger() {
        return charger;
    }

    public void setCharger(boolean charger) {
        this.charger = charger;
    }

    public SmallAppliances(String manufacturingFirm, int serialNumber, boolean remote, boolean charger) {
        super(manufacturingFirm, serialNumber);
        this.remote = remote;
        this.charger = charger;
    }
}
