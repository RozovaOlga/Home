import java.util.concurrent.Callable;

/**
 * Имеются 2 дома размерами  a  на b и с на d.Имеется участо размерами e на f.
 * Проверить, помещаются ли эти дома на участке.
 * Стороны домов параллельны сторонам участка, в остальном размещение может быть любым
 */
public class Number7 {

    public static void main(String[] args) {
        Home home1 = new Home();
        home1.setLength(4);
        home1.getLength();
        home1.setWidth(3);
        home1.getWidth();
        Home home2 = new Home();
        home2.setLength(1);
        home2.getLength();
        home2.setWidth(2);
        home2.getLength();
        Land land = new Land();
        land.setLength(5);
        land.setWidth(9);
        Calculate calculate = new Calculate();
        calculate.testCalculate(home1, home2, land);
    }
}

class Home {
    int length;
    int Width;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.Width = width;
    }

    public int getWidth() {
        return Width;
    }
}

class Land {
    int length;
    int Width;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.Width = width;
    }

    public int getWidth() {
        return Width;
    }
}

class Calculate {
    public void testCalculate(Home home1, Home home2, Land land) {
        if (((home1.length + home2.length) <= land.length) && ((home1.Width + home2.Width) <= land.Width)) {
            System.out.println("Помещаются");
        } else if (((home1.length + home2.Width) <= land.length) && ((home1.Width + home2.length) <= land.Width)) {
            System.out.println("Помещаются");
        } else if (((home1.length + home2.Width) <= land.Width) && ((home1.Width + home2.length) <= land.length)) {
            System.out.println("Помещаются");
        } else if (((home1.length + home2.length) <= land.Width) && ((home1.Width + home2.Width) <= land.length)) {
            System.out.println("Помещаются");
        } else {
            System.out.println("Не помещаются");
        }
    }
}