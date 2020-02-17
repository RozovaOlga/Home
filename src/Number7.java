
/**
 * Имеются 2 дома размерами  a  на b и с на d.Имеется участо размерами e на f.
 * Проверить, помещаются ли эти дома на участке.
 * Стороны домов параллельны сторонам участка, в остальном размещение может быть любым
 */
public class Number7 {

    public static void main(String[] args) {
        Home home1 = new Home(3, 5);
        Home home2 = new Home(11, 3);
        Land land = new Land(5, 15);
        Calculate calculate = new Calculate();
        calculate.testCalculate(home1, home2, land);
    }
}

class Home {
    int length;
    int width;

    public Home(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Land {
    int length;
    int width;

    public Land(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Calculate {
    public void testCalculate(Home home1, Home home2, Land land) {
        if (((home1.length + home2.length) <= land.length) && (home1.width <= land.width) && (home2.width <= land.length)) {
            System.out.println("Помещаются");
        } else if (((home1.length + home2.width) <= land.length) && (home1.width <= land.width) && (home2.length <= land.width)) {
            System.out.println("Помещаются");
        } else if (((home1.length + home2.width) <= land.width) && (home1.width <= land.length) && (home2.length <= land.length)) {
            System.out.println("Помещаются");
        } else if (((home1.length + home2.length) <= land.width) && (home1.width <= land.length) && (home2.width <= land.length)) {
            System.out.println("Помещаются");
        } else if (((home1.width + home2.width) <= land.width) && (home1.length <= land.length) && (home2.length <= land.length)) {
            System.out.println("Помещаются");
        } else if (((home1.width + home2.length) <= land.width) && (home1.length <= land.length) && (home2.width <= land.length)) {
            System.out.println("Помещаются");
        } else if (((home1.width + home2.length) <= land.length) && (home1.length <= land.width) && (home2.width <= land.width)) {
            System.out.println("Помещаются");
        } else if (((home1.width + home2.width) <= land.length) && (home1.length <= land.width) && (home2.length <= land.width)) {
            System.out.println("Помещаются");
        } else {
            System.out.println("Не помещаются");
        }
    }
}