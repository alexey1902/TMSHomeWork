package Unit3;
import java.text.DecimalFormat;
import java.util.Random;

public class Unit3Task8 {
    public static void main(String[] args) {
        double [] mas1 = new double[10];
        double [] mas2 = new double[10];
        double [] mas3 = new double[10];
        int counter = 0;
        Random rand = new Random();
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = rand.nextInt(10);
            System.out.print(new DecimalFormat( "#" ).format(mas1[i]) + " ");
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = rand.nextInt(16);
            System.out.print(new DecimalFormat( "#" ).format(mas2[i]) + " ");
        }
        System.out.println();
        for(int i =0; i< mas3.length; i++) {
            if(mas2[i]==0){
                mas3[i] = 0;
            }
            else {
                mas3[i] = (mas1[i] / mas2[i]);
            }
            if(mas3[i]%1==0){
                counter++;
            }
            System.out.print(new DecimalFormat( "#.###" ).format(mas3[i]) + " ");
        }
        System.out.println();
        System.out.println("Количество целых чисел в 3ем массиве = " + counter);
    }
}
