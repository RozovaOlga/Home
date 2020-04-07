package by.home.lesson15.ReadText;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void taskSolution() {
        ListBook listBook = new ListBook();
        Storage storage = new Storage();
        storage.writeFile(listBook);
        storage.readFile(listBook);
        sortedByAuthor();
    }

    public static void sortedByAuthor() {
        Map<String, List<String>> collect = ListBook.getList().stream()
                .collect(Collectors.groupingBy(Books::getAuthorName,
                        Collectors.mapping(Books::getTitleOfTheBook, Collectors.toList())));
        collect.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
