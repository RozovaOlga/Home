package main.java.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
        final List<Integer> rating = randomRaring();
        final List<Integer> satisfactoryRating = getList(rating);
        System.out.println(rating);
        System.out.println(satisfactoryRating);
    }

    private static List<Integer> randomRaring() {
        int i = 10;
        final List<Integer> randomNumbers = new ArrayList<Integer>(i);
        final Random rand = new Random();
        while (i-- > 0) {
            randomNumbers.add(rand.nextInt(10));
        }
        return randomNumbers;
    }

    private static List<Integer> getList(final List<Integer> satisfactoryRating) {
        List<Integer> newList = new ArrayList<>(satisfactoryRating);
        newList.removeIf(val -> val < 7);
        return newList;
    }
}
