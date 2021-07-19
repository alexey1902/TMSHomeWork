package Unit3;
import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        int mas1[] = new int[5];
        int mas2[] = new int[5];
        Random rand = new Random();
        double sr1=0, sr2=0;
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = rand.nextInt(16);
            System.out.print(mas1[i] + " ");
            sr1+=mas1[i];
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = rand.nextInt(16);
            System.out.print(mas2[i] + " ");
            sr2+=mas2[i];
        }
        System.out.println();
        //Можно не искать ср.арифм. делением на 5, а просто сравнить суммы элементов, т.к.
        //в массивах только положительные числа и количество элементов одинаковое
        if (sr1>sr2) {
            System.out.println("Ср.арифм. первого массива больше");
        }
        else if(sr1<sr2){
            System.out.println("Ср.арифм. второго массива больше");
        }
        else{
            System.out.println("Средние арифметические равны");
        }
    }
}
