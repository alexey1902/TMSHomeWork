package Unit3;
import java.util.Random;

public class Unit3Task15 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            mas[i] = rand.nextInt(10);
            System.out.print(mas[i] + " ");
            if (i%2!=0) {
                mas[i] = 0;
            }
        }
        System.out.println();
        for(int i = 0; i<10; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
