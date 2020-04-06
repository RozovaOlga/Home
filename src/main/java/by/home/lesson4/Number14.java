package by.home.lesson4;

/**
 * Вывести индекс максимальной оценки
 */
public class Number14 {
    public static void main(String[] args) {
        int mas[] = {2, 9, 4, 8, 7, 4, 10};
        int maxGrade = 0;
        int numberElement = 0;
        /**
         * We are looking for the maximum estimate in the array.
         * If there are two of them, we print the first
         */
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maxGrade) {
                maxGrade = mas[i];
                numberElement = i;
            }
        }
        System.out.println(numberElement);
    }
}
