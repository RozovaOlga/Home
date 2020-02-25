package main.java.lesson5;

/**
 * The type Number 19.
 */
public class Number19 {
    /**
     * The entry point of application.
     * Имеется строка с текстом. Подсчитать количество слов в тексте.
     * Желательно учесть, что слова могут разделяться несколькими пробелами,
     * В начале и в конце текста могут быть пробелы,но могут и отсувствовать.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String text = "   \uD83C\uDF89    \uD83D\uDE04 \uD83D\uDC4F    \uD83C\uDF89    ";
        int number = text.trim().split(" \\s*").length;
        System.out.println(number);
        System.out.println(text);
    }
}
