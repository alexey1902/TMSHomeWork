package Unit3;
import java.util.Random;

public class Unit3Task19 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random rand = new Random();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++) {
            if((mas[i] = rand.nextInt(10))<min && i%2==0){
                min = mas[i];
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Минимальный среди чётных = " + min);
    }
}
