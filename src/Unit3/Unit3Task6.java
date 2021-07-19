package Unit3;
import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        int[] mas = new int[4];
        Random rand = new Random();
        boolean isSequence = true;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(11);
            System.out.print(mas[i] + " ");
        }
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] >= mas[i + 1]) {
                isSequence = false;
                break;
            }
        }
        System.out.println();
        if(isSequence){
            System.out.println("Массив является строго возрастающей последовательностью");
        }
        else{
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
