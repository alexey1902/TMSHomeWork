package Unit3;

import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args) {
        int mas[] = new int[2];
        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mas.length; i++) {
           if((mas[i] = rand.nextInt(16))>max) {
               max = mas[i];
           }
           System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальный = " + max);
        for(int i = mas.length-1; i>-1; i--){
            if(mas[i]==max){
                System.out.println("Индекс последнего вхождения = " + i);
                break;
            }
        }
    }
}
