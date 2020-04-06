package by.home.lesson10;

import java.util.*;
import java.util.function.Function;
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
        final Map<String, Long> wordToCount = getMap(text);
        wordToCount.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    /**
     * Main solution : getMap
     */
    private static Map<String, Long> getMap(final String text) {
        Map<String, Long> newMap;
        newMap = text.lines().flatMap(word -> Stream.of(word.toLowerCase().replaceAll("[^A-Za-zА-Яа-я_]", " ").split("\\s+")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return newMap;
    }
}
