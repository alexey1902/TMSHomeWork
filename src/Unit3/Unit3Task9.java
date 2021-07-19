package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task9 {
    public static void main(String[] args) {
        int n=0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        while(n<=0){
            System.out.print("Введите корректную размерность массива(n>0): ");
            n = scan.nextInt();
        }
        int[] mas = new int[n];
        int sumLeft = 0, sumRight = 0;
        for(int i=0; i< mas.length; i++) {
            mas[i] = rand.nextInt(16);
            if(i<= mas.length/2){
                sumLeft+=mas[i];
            }
            else{
                sumRight+=mas[i];
            }
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        if(sumLeft>sumRight) {
            System.out.println("Сумма левой части больше");
        }
        else{
            System.out.println("Сумма правой части больше");
        }
    }
}
