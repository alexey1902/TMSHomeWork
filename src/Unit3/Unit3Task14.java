package Unit3;
import java.util.Random;

public class Unit3Task14 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random rand = new Random();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            mas[i] = rand.nextInt(10);
            System.out.print(mas[i] + " ");
            if (mas[i]%2!=0 && mas[i]<min) {
                min = mas[i];
            }
        }
        System.out.println();
        System.out.println("Min = " + min);
    }
}
