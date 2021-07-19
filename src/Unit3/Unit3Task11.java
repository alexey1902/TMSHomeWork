package Unit3;
import java.util.Random;

public class Unit3Task11 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        int result = 1;
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            mas[i] = rand.nextInt(10);
            if (mas[i] % 3 == 0) {
                result *= mas[i];
            }
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        if (result == 1) {
            System.out.println("Цифр кратных трём не было");
        }
        else{
            System.out.println("Произведение = " + result);
        }
    }
}
