package by.home.lesson10;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Number 29.
 * Имеется текст. Следует составить для него частотный словарь
 */
public class Number29OtherSolutions {
    /**
     * The entry point of application.
     * Regular expressions :
     * "[^A-Za-zА-Яа-я_]" - not letters;
     * "\\s+" - one or more spaces.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final String text = "Дети постоянно хотят  смотреть мультики. Мультики, мультики... это ведь дети.";
        final List<String> wordText = Arrays.asList
                (text.toLowerCase().replaceAll("[^A-Za-zА-Яа-я_]", " ").split("\\s+"));
        final Map<String, Long> wordToCount = getMap1(wordText);
        wordToCount.forEach((k, v) -> System.out.println(k + " - " + v));
    }


    /**
     * Other solutions:  getMap1
     */
    private static Map<String, Long> getMap1(final List<String> wordText) {
        Map<String, Long> newMap1 = new HashMap<>();
        wordText.forEach(word -> newMap1.put(word, newMap1.containsKey(word) ? newMap1.get(word) + 1 : 1));
        return newMap1;
    }

    /**
     * Other solutions:  getMap2
     */
    private static Map<String, Long> getMap2(final List<String> wordText) {
        Map<String, Long> newMap2;
        newMap2 = wordText.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        return newMap2;
    }
}