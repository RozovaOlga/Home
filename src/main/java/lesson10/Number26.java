package main.java.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Number 26.
 * Создать список оценок учеников с помощью ArrayList.Заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */
public class Number26 {
    /**
     * The entry point of application.
     * Unsatisfactory rating - less than 7
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final List<Integer> rating = new ArrayList<>(Arrays.asList(5, 10, 5, 2, 6, 9, 8, 6, 3));
        final List<Integer> satisfactoryRating = getList(rating);
        System.out.println(satisfactoryRating);
    }

    private static List<Integer> getList(final List<Integer> satisfactoryRating) {
        List<Integer> newList = new ArrayList<>(satisfactoryRating);
        newList.removeIf(val -> val < 7);
        return newList;
    }
}
