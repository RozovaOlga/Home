package by.home.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskLesson17 {
    public static void main(String[] args) {
        String text = "  R 1234567   8901   2  ";
        System.out.println(vv(text));
    }

    private static boolean vv(String text) {
        return text.replaceAll("\\s", "").matches("[EDR][0-9]{12}");
    }
}
