package main.java.lesson10;

import java.util.*;

import static java.util.Collections.singletonMap;

public class Number29Reduce {
    public static void main(String[] args) {
        final String text = "Дети постоянно хотят  смотреть мультики. Мультики, мультики... это ведь дети.";
        final List<String> wordText = Arrays.asList
                (text.toLowerCase().replaceAll("[^A-Za-zА-Яа-я_]", " ").split("\\s+"));
        final Map<String, Long> wordToCount = getMap(wordText);
        wordToCount.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    private static Map<String, Long> getMap(final List<String> wordText) {
        Map<String, Long> newMap = new HashMap<>();
        wordText.stream()
                .map((word) -> singletonMap(word, 1L))
                .reduce(newMap, (word1, word2) -> {
                    for (Map.Entry<String, Long> entry : word2.entrySet()) {
                        word1.put(entry.getKey(), word1.getOrDefault(entry.getKey(), 0L) + entry.getValue());
                    }
                    return word1;
                });
        return newMap;
    }
}
