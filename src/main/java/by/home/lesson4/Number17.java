package by.home.lesson4;

/**
 * Создать двухмерный квадратный массив и заполнить его бабочкой
 */
public class Number17 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i > j) && (i < matrix.length / 2)) {
                    matrix[i][j] = 0;
                } else if ((i > j) && (j < (matrix[i].length - i - 1))) {
                    matrix[i][j] = 0;
                } else if ((i < j) && (i > matrix.length / 2)) {
                    matrix[i][j] = 0;
                } else if ((i < j) && (j > matrix[i].length - i - 1)) {
                    matrix[i][j] = 0;
                } else matrix[i][j] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
