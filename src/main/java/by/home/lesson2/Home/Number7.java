package by.home.lesson2.Home;

/**
 * Имеются 2 дома размерами  a  на b и с на d.Имеется участо размерами e на f.
 * Проверить, помещаются ли эти дома на участке.
 * Стороны домов параллельны сторонам участка, в остальном размещение может быть любым
 */
public class Number7 {

    public static void main(String[] args) {
        Home home1 = new Home(3,5);
        Home home2 = new Home(11, 5);
        Land land = new Land(5, 15);
        Calculate calculate = new Calculate();
        calculate.testCalculate(home1, home2, land);
    }
}

class Home {
    private int length;
    private int width;
    public Home(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}

class Land {
    private int length;
    private int width;

    public  Land(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}

class Calculate {
    public void testCalculate(Home home1, Home home2, Land land) {
        if (((home1.getLength() + home2.getLength()) <= land.getLength()) && (home1.getWidth() <= land.getWidth()) && (home2.getWidth()<= land.getLength())) {
            System.out.println("Помещаются");
        } else if (((home1.getLength() + home2.getWidth()) <= land.getLength()) && (home1.getWidth() <= land.getWidth()) && (home2.getLength() <= land.getWidth())) {
            System.out.println("Помещаются");
        } else if (((home1.getLength() + home2.getWidth()) <= land.getWidth()) && (home1.getWidth() <= land.getLength()) && (home2.getLength() <= land.getLength())) {
            System.out.println("Помещаются");
        } else if (((home1.getLength() + home2.getLength()) <= land.getWidth()) && (home1.getWidth() <= land.getLength()) && (home2.getWidth() <= land.getLength())) {
            System.out.println("Помещаются");
        } else if (((home1.getWidth() + home2.getWidth()) <= land.getWidth()) && (home1.getLength() <= land.getLength()) && (home2.getLength() <= land.getLength())) {
            System.out.println("Помещаются");
        } else if (((home1.getWidth() + home2.getLength()) <= land.getWidth()) && (home1.getLength() <= land.getLength()) && (home2.getWidth() <= land.getLength())) {
            System.out.println("Помещаются");
        } else if (((home1.getWidth() + home2.getLength()) <= land.getLength()) && (home1.getLength() <= land.getWidth()) && (home2.getWidth() <= land.getWidth())) {
            System.out.println("Помещаются");
        } else if (((home1.getWidth() + home2.getWidth()) <= land.getLength()) && (home1.getLength() <= land.getWidth()) && (home2.getLength() <= land.getWidth())) {
            System.out.println("Помещаются");
        } else {
            System.out.println("Не помещаются");
        }
    }
}