/**
 * Имеются 2 дома размерами  a  на b и с на d.Имеется участо размерами e на f.
 * Проверить, помещаются ли эти дома на участке.
 * Стороны домов параллельны сторонам участка, в остальном размещение может быть любым
 */
public class Number7 {

    public static void main(String[] args) {
        int house1Length = 4;
        int house1Width = 3;
        int house2Length = 3;
        int house2Width = 1;
        int landLength = 4;
        int landWidth = 10;
        if (((house1Length + house2Length) <= landLength) && ((house1Width + house2Width) <= landWidth)) {
            System.out.println("Помещаются");
        } else if (((house1Length + house2Width) <= landLength) && ((house1Width + house2Length) <= landWidth)) {
            System.out.println("Помещаются");
        } else if (((house1Length + house2Width) <= landWidth) && ((house1Width + house2Length) <= landLength)) {
            System.out.println("Помещаются");
        } else if (((house1Length + house2Length) <= landWidth) && ((house1Width + house2Width) <= landLength)) {
            System.out.println("Помещаются");
        } else {
            System.out.println("Не помещаются");
        }
    }
}