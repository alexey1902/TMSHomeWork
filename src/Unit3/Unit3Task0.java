package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scan.nextInt();
        int [] mas = new int[n];
        Random rand = new Random();
        for(int i=0; i<n; i++) {
            mas[i] = rand.nextInt(10);
            System.out.print(mas[i] + " ");
        }
    }
}
