package main.java.lesson4;

/**
 * BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int massiv[] = {9, 0, 7, 0, 1, 9, 5, 3, 3, 7, 0};
        int temp = 0;
        /**
         * Compare the item with the following.If it is larger, the elements change places.
         * In the last position is the largest element. Exclude the last element from the check and compare again
         */
        for (int k = massiv.length; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                for (int j = i + 1; j < k; j--) {
                    if (massiv[i] > massiv[j]) {
                        temp = massiv[i];
                        massiv[i] = massiv[j];
                        massiv[j] = temp;
                    } else break;
                }
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
    }
}
