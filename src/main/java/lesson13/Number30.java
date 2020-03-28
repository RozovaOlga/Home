package main.java.lesson13;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * The type Number 30.
 */
public class Number30 {
    /**
     * The entry point of application.
     * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String text1 = " точка . точка. запятая, - вышла мордочка кривая";
        writeFile(text1);
        System.out.println(readFile());
        System.out.println(words(readFile()));
        System.out.println(punctuation(readFile()));
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

    private static long punctuation(String text) {
        long count = 0;
        String symbols = "\\p{Punct}";
        Pattern pattern = Pattern.compile(symbols);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private static long words(String text) {

        return Stream.of(text.replaceAll("[^A-Za-zА-Яа-я_]", " ").trim().split(" \\s*"))
                .filter(s -> s.trim().length() > 0)
                .count();

    }
}
