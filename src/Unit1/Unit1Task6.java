package Unit1;

import java.util.Scanner;

public class Unit1Task6 {
    public static void main(String[] args) {
        System.out.print("Введите 2 числа: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a>b) {
            System.out.print("Большее = " + a);
        }
        else if(a<b) {
            System.out.print("Большее = " + b);
        }
        else{
            System.out.print("Оба равны = " + b);
        }
    }
}