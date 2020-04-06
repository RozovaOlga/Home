package by.home.lesson13;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Number 31.
 * Имеется файл с текстом в котором присутствуют числа.
 * Найти все числа, распечатать, посчитать сумму, убрать все повторяющееся числа и снова распечатать
 */
public class Number31 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String text1 = "null 12 10 10";
        writeFile(text1);
        readFile();
        System.out.println(numberSearch(readFile()));
        System.out.println(sum(numberSearch(readFile())));
        System.out.println(deleteDuplicateNumber(readFile()));

    }

    private static String readFile() {
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            String line = reader.readLine();
            while (line != null) {
                text.append(line).append(" ");
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("error");
        }
        return text.toString();
    }

    private static void writeFile(String text) {
        File file = new File("text.txt");
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
            if (text != null) {
                fileWriter.write(text);
            } else {
                System.out.println("Извините,текст не найден");
                System.exit(0);
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    private static List<String> numberSearch(String text) {
        return Arrays.stream(text.split("\\s"))
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());
    }

    private static int sum(List<String> numberSearch) {
        return numberSearch.stream()
                .mapToInt(Integer::parseInt)
                .reduce(Integer::sum)
                .orElse(0);
    }

    private static List<String> deleteDuplicateNumber(String text) {
        return Arrays.stream(text.split("\\s"))
                .filter(s -> s.matches("\\d+"))
                .distinct()
                .collect(Collectors.toList());

    }
}
