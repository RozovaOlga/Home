package main.java.lesson4;

/**
 * Создать двухмерный квадратный массив и заполнить его бабочкой
 */
public class Number17 {
    public static void main(String[] args) {
        int[][] matrice = new int[10][10];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if ((i>j)&&(i<matrice.length/2)) {
                    matrice[i][j] = 0;
                }else if ((i>j)&&(j<(matrice[i].length-i-1))) {
                    matrice[i][j] = 0;
                }
                else if ((i<j)&&(i>matrice.length/2)){
                    matrice[i][j] = 0;
                }else if ((i<j)&&(j>matrice[i].length-i-1)){
                    matrice[i][j] = 0;
                }
                else matrice[i][j]=1;
                System.out.print(matrice[i][j] + " "); }
            System.out.println();
        }
    }
}
