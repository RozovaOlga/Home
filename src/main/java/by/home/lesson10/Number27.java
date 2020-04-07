package by.home.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * The type Number 27.
 * Создать коллекцию. Наполнить ее случайными числами. Удалить повторяющиеся числа
 */
public class Number27 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final List<Integer> numbers = randomNumbers1();
        final List<Integer> deletingPostingNumber = getList(numbers);
        System.out.println(numbers);
        System.out.println(deletingPostingNumber);
    }

    private static List<Integer> randomNumbers1() {
        int i = 10;
        final List<Integer> randomNumbers = new ArrayList<Integer>(i);
        final Random rand = new Random();
        while (i-- > 0) {
            randomNumbers.add(rand.nextInt(10));
        }
        return randomNumbers;
    }

    private static List<Integer> getList(final List<Integer> deletingPostingNumber) {
        return deletingPostingNumber.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}