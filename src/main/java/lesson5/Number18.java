package main.java.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The type Number 18.
 * Найти в строке всякие разные специальные символы,не знаю,как их назвать в общем
 */
public class Number18 {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String symbols = "\\p{javaWhitespace}|\\p{Alnum}|[а-яА-Я]";
        String str = "1234% ЛяЛя № # ^ &  NoNo**";
        Pattern pattern = Pattern.compile(symbols);
        Matcher matcher = pattern.matcher(str);
        int n = 0;
        while (matcher.find()) {
            n++;
        }
        System.out.println(str.length());
        System.out.println(n);
        System.out.println(str.length() - n);
    }
}



