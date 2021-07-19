package Unit1;

import java.util.Scanner;

public class Unit1Task2 {
    public static void main(String[] args) {
        System.out.print("Введите стороны треугольника: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if((a+b)<=c || (b+c)<=a || (a+c)<=b || a <= 0 || b <= 0 || c <= 0) {
            System.out.print("Таких треугольников не бывает!");
        }
        else {
            System.out.print("Такой треугольник существует!");
        }
    }
}
