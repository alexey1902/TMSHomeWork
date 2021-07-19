package Unit1;

import java.util.Scanner;

public class Unit1Task5 {
    public static void main(String[] args) {
        System.out.print("Введите 3 целых числа: ");
        int [] numbers = new int[3];
        int count = 0, countZero=0;
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            numbers[i] = scan.nextInt();
            if(numbers[i]>0) count++;
            if(numbers[i]==0) countZero++;
        }
        System.out.println("Количество положительных чисел - " + count);
        System.out.print("Количество отрицательных чисел - " + (3-count-countZero));
    }
}