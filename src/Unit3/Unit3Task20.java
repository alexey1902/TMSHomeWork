package Unit3;
import java.util.Random;

public class Unit3Task20 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random rand = new Random();
        int max = Integer.MIN_VALUE, indexOfMax = 0;
        for (int i = 0; i < mas.length; i++) {
            if ((mas[i] = rand.nextInt(10)) > max) {
                max = mas[i];
                indexOfMax = i;
            }
            System.out.print(mas[i] + " ");
        }
        mas[indexOfMax]=mas[0];
        mas[0] = max;
        System.out.println();
        for(int i = 0; i< mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
