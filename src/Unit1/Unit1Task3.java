package Unit1;

import java.util.Scanner;

public class Unit1Task3 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number>0) {
            number++;
        }
        else if(number<0) {
            number-=2;
        }
        else{
            number = 10;
        }
        System.out.print("Преобразовнное число = " + number);
    }
}