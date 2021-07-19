package Unit3;
import java.util.Random;

public class Unit3Task17 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random rand = new Random();
        int compare = rand.nextInt(10), counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if((mas[i] = rand.nextInt(10))==compare) {
                counter++;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Элемент "+compare+" встречается "+counter+" раз(а)");
    }
}
