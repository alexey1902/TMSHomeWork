package Unit3;
import java.util.Random;
import java.util.Scanner;

public class Unit3Task13 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double sr = 0 , counter = 0;
        System.out.println("Enter N:");
        int n = scan.nextInt();
        for (int i = 0; i < 10; i++) {
            mas[i] = rand.nextInt(10);
            System.out.print(mas[i] + " ");
            if (mas[i]>= n) {
                sr += mas[i];
                counter++;
            }
        }
        System.out.println();
        System.out.println("Result = " + (sr / counter));
    }
}
