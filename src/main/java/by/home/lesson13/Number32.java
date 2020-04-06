package by.home.lesson13;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Number 32.
 * Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл
 * Распечатать числа и их среднее арифметическое
 */
public class Number32 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<Integer> list = randomNumber();
        writeFile(list);
        System.out.println(readFile());
        System.out.println(arithmeticalMean(readFile()));
    }

    private static void writeFile(List<Integer> list) {
        File file = new File("text.txt");
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            if (list != null) {
                for (Integer line : list) {
                    dataOutputStream.write(line);
                }
            } else {
                System.out.println("Извините,текст не найден");
                System.exit(0);
            }

        } catch (IOException e) {
            System.out.println("error");
        }
    }

    private static List<Integer> readFile() {
        List<Integer> list = new ArrayList<>();
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("text.txt")))) {
            while (dataInputStream.available() > 0) {
                int result = dataInputStream.read();
                list.add(result);
            }
        } catch (IOException e) {
            System.out.println("error");
        }
        return list;
    }

    private static List<Integer> randomNumber() {
        int i = 20;
        final List<Integer> randomNumbers = new ArrayList<Integer>(i);
        final Random random = new Random();
        while (i-- > 0) {
            randomNumbers.add(random.nextInt(10));
        }
        return randomNumbers;
    }

    /**
     * Arithmetical mean double.
     *
     * @param list the list
     * @return the double
     */
    public static Double arithmeticalMean(List<Integer> list) {
        return list.stream().collect(Collectors.averagingInt(i -> i));
    }
}
