package Unit3;
import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        int mas[] = new int[15];
        Random rand = new Random();
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if((mas[i] = rand.nextInt(100))%2==0){
              counter++;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Количество чётных = " + counter);
    }
}
