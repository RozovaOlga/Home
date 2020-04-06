package by.home.lesson11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Number28 {
    public static void main(String[] args) {
        final List<Integer> rating = randomRaring();
        System.out.println(rating);
        System.out.println(getMax(rating));
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

    private static Integer getMax(final List<Integer> rating) {
        Iterator<Integer> iterator = rating.iterator();
        Integer max = null;
        while (iterator.hasNext()) {
            if (max == null) {
                max = iterator.next();
            } else {
                Integer a = iterator.next();
                if (a.compareTo(max) > 0) {
                    max = a;
                }
            }
        }
        return max;
    }
}
