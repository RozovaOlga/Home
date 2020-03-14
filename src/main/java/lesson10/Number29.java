package main.java.lesson10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The type Number 29.
 * Имеется текст. Следует составить для него частотный словарь
 */
public class Number29 {
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
        final Map<String, Long> wordToCount = getMap(wordText);
        wordToCount.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    /**
     * Main solution : getMap
     */
    private static Map<String, Long> getMap(final List<String> wordText) {
        return wordText.stream()
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }

    /**
     * Other solutions:  getMap1,  getMap2
     */
    private static Map<String, Long> getMap1(final List<String> wordText) {
        Map<String, Long> newMap = new HashMap<>();
        wordText.forEach(word -> newMap.put(word, newMap.containsKey(word) ? newMap.get(word) + 1 : 1));
        return newMap;
    }

    private static Map<String, Long> getMap2(final List<String> wordText) {
        Map<String, Long> newMap2 = new HashMap<>();
        newMap2 = wordText.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        return newMap2;
    }
}
