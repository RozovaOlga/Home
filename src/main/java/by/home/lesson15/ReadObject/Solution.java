package by.home.lesson15.ReadObject;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void taskSolution() {
        Storage storage = new Storage();
        FileBook bookList = new FileBook();
        storage.writeFile(bookList);
        storage.readFile(bookList);
        sortedByAuthor();
    }

    public static void sortedByAuthor() {
        Map<String, List<String>> collect = FileBook.getList().stream()
                .collect(Collectors.groupingBy(Books::getAuthorName,
                        Collectors.mapping(Books::getTitleOfTheBook, Collectors.toList())));
        collect.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
