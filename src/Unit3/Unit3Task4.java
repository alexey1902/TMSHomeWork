package Unit3;
import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        int mas[] = new int[20];
        Random rand = new Random();
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(20);
            System.out.print(mas[i] + " ");
            if(i%2!=0) {
                mas[i]=0;
            }
        }
        System.out.println();
        for(int i = 0; i< mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
