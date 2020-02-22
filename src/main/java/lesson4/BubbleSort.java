package main.java.lesson4;

/**
 * BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {9, 0, 7, 0, 1, 9, 5, 3, 3,7,0};
        int temp = 0;
        /**
         * Compare the item with the following.If it is larger, the elements change places.
         * In the last position is the largest element. Exclude the last element from the check and compare again
         */
        for (int k = a.length; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                for (int j = i + 1; j < k; j--) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    } else break;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
