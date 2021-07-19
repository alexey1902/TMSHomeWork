package Unit3;
import java.util.Random;

public class Unit3Task16 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int compare;
        boolean equal = false;
        for(int i = 0; i< mas.length-1; i++) {
            for(int j = i+1; j< mas.length; j++){
                if(mas[j]==mas[i]){
                    equal=true;
                }
            }
        }
        if(equal){
            System.out.println("Есть повторяющиеся элементы");
        }
        else{
            System.out.println("Нет повторяющихся элементов");
        }
    }
}
