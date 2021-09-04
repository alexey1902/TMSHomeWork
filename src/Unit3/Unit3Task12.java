package Unit3;
import java.util.Random;

public class Unit3Task12 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random rand = new Random();
        double sr=0;
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            mas[i] = rand.nextInt(10);
            System.out.print(mas[i]+" ");
            if(i%2!=0){
                sr+=mas[i];
                counter++;
            }
        }
        System.out.println();
        System.out.println("Result = " +(sr/counter));
    }
}
