package Unit3;
import java.util.Random;

public class Unit3Task18 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random rand = new Random();
        int max = Integer.MIN_VALUE, beforeMax = Integer.MIN_VALUE;
        for (int i = 0; i < mas.length; i++) {
           if((mas[i] = rand.nextInt(10))>max){
               max = mas[i];
           }
            System.out.print(mas[i] + " ");
        }
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] > beforeMax && mas [i]!=max){
                beforeMax = mas[i];
            }
        }
        System.out.println();
        System.out.println("Максимальный = " + max);
        System.out.println("Первый до максимального = " + beforeMax);
    }
}
