package by.home.lesson2; /**
 * Имеется прямоугольное отверстие размерами a и b
 * Определить,можно ли его полностью закрыть круглой картонкой радиусом r
 */

import java.util.Scanner;

public class Number4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину отверстия");
        double rectangleLength = scanner.nextDouble();
        System.out.println("Введите ширину отверстия");
        double rectangleWidth = scanner.nextDouble();
        System.out.println("Введите радиус вашей круглой картонки");
        double rangeRadius = scanner.nextDouble();
        double rectangleRadius = Math.sqrt(Math.pow(rectangleLength, 2) + Math.pow(rectangleWidth, 2)) / 2;
        if (rectangleRadius <= rangeRadius) {
            System.out.println("Ваша картонка полностью закроет отверстие");
        } else
            System.out.println("Картонка никак не закроет отвестие,вырезайте новую");
    }
}
