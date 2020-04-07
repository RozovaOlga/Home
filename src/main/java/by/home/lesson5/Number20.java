package by.home.lesson5;

/**
 * The type Number 20.
 * Имеется строка с текстом.Вывести текст, составленный из последних букв всех слов
 */
public class Number20 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String string = "  мама мыла   раму   ";
        StringBuilder stringBuilder = new StringBuilder();
        String[] letter = string.trim().split("\\s+");
        for (String word : letter)
            stringBuilder.append(word.toCharArray()[word.length() - 1]);
        System.out.println(stringBuilder.toString());
    }
}
