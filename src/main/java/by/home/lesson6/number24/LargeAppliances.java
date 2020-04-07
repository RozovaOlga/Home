package by.home.lesson6.number24;

public class LargeAppliances extends Appliances {
    private int weight;
    private int width;
    private int height;
    private int length;

    public LargeAppliances(String manufacturingFirm, int serialNumber, int weight, int width, int height, int length) {
        super(manufacturingFirm, serialNumber);
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
