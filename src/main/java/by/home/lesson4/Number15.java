package by.home.lesson4;

/**
 * Определить сумму элементов массива,расположенных между максимальным и минимальным значениями.
 * Если максимальных и минимальных значений несколько - найменьшее расстояние
 */
public class Number15 {
    public static void main(String[] args) {
        int numbers[] = {5, 0, 6, 10, 3, 0, 10};
        int maxElement = numbers[0];
        int indexMax = numbers.length;
        int minElement = numbers[0];
        int indexMin = 0;
        int sum = 0;
        int indexDistance = numbers.length;
        /**
         *look up the value of the maximum and minimum element in the array
         */
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
                indexMax = i;
            }
            if (numbers[i] < minElement) {
                minElement = numbers[i];
                indexMin = i;
            }
        }
        /**
         * look for the minimum distance between the maximum and minimum element in the array
         * Assign them an index
         */
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((numbers[i] == maxElement) && (numbers[j] == minElement) && (Math.abs(i - j) < indexDistance + 1)) {
                    indexDistance = Math.abs(i - j) - 1;
                    indexMin = j;
                    indexMax = i;
                }
            }
        }
        /**
         * Find the sum between the maximum and minimum element of the array
         */
        if (indexMin < indexMax) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum = sum + numbers[i];
            }
        }
        if (indexMin > indexMax) {
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);
    }
}