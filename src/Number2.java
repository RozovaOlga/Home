
/**
 * Задание 2
 * Имеется промежуток времени в секундах.Вывести его на страницу в виде недель,суток,часов,минут,секунд.
 */
public class Number2 {

    public static void main(String[] args) {
        int s = 91793700;
        int sec;
        int m, min;
        int hour, h;
        int day, d;
        int week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        week = (d - day) / 7;
        System.out.println(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");
    }
}