package Unit4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
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
        int mainDiag = 1, sideDiag = 1;
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            mainDiag *= matrix[i][j];
        }
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            sideDiag *= matrix[i][j];
        }
        System.out.println();
        System.out.println("Произведение главной диагонали - " + mainDiag);
        System.out.println("Произведение побочной диагонали - " + sideDiag);
        if (mainDiag > sideDiag) {
            System.out.println("Произведение элементов главной диагонали больше");
        } else if (sideDiag > mainDiag) {
            System.out.println("Произведение элементов побочной диагонали больше");
        } else {
            System.out.println("Произведения элементов обоих диагоналей равны");
        }
    }
}
