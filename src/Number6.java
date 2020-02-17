/**
 * Имеются три числа - день,месяц,год.
 * Вывести в виде трех чисел дату следующего дня
 */

import java.util.Scanner;

public class Number6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день");
        int day = in.nextInt();
        System.out.println("Введите месяц");
        int month = in.nextInt();
        System.out.println("Введите год");
        int year = in.nextInt();
        if ((day <= 0) || (month <= 0) || (year <= 0)) {
            System.out.println("такой даты не существует");
        }
        if ((day == 31) && (month == 12)) {
            System.out.println("01.01." + (year + 1));
        } else if (month == 2) {
            if (day == 28) {
                if (year % 4 == 0) {
                    if (year % 100 != 0) {
                        System.out.println((day + 1) + "." + month + "." + year);
                    } else if (year % 400 == 0) {
                        System.out.println((day + 1) + "." + month + "." + year);
                    } else {
                        System.out.println("01." + (month + 1) + "." + year);
                    }
                } else if (day >= 30) {
                    System.out.println("дня с таким номером не существует");
                } else {
                    System.out.println("1" + "." + month + "." + year);
                }
            } else if (day == 29) {
                if (year % 4 == 0) {
                    if (year % 100 != 0) {
                        System.out.println("01." + (month + 1) + "." + year);
                    } else if (year % 400 == 0) {
                        System.out.println("01." + (month + 1) + "." + year);
                    } else {
                        System.out.println("Такого дня не существует");
                    }
                } else {
                    System.out.println("Такого дня не существует");
                }
            } else if (day >= 30) {
                System.out.println("дня с таким номером не существует");
            } else {
                System.out.println("1" + "." + (month + 1) + "." + year);
            }

        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            if (day == 30) {
                System.out.println("01." + (month + 1) + "." + year);
            } else if (day >= 31) {
                System.out.println("дня с таким номером не существует");
            } else {
                System.out.println((day + 1) + "." + month + "." + year);
            }
        } else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) {
            if (day == 31) {
                System.out.println("01." + (month + 1) + "." + year);
            } else if (day >= 32) {
                System.out.println("дня с таким номером не существует");
            } else {
                System.out.println((day + 1) + "." + month + "." + year);
            }
        } else if (month >= 13) {
            System.out.println("такой даты не существует");
        }
    }
}