package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n <= 1) {
            System.out.println("Введите размер матрицы(n>1): ");
            n = scan.nextInt();
        }
        int[][] matrix = new int[n][n];
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(51);
                if (matrix[i][j] < 10) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            if (matrix[i][j] % 2 == 0) {
                sum += matrix[i][j];
            }
        }
        System.out.println("\n" + "Сумма чётных элементов на главной диагонали: " + sum);
    }
}