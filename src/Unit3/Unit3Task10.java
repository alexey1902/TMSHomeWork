package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task10 {
    public static void main(String[] args) {
        int n=0, n2=0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        while(n<=3){
            System.out.print("Введите корректную размерность массива(n>3): ");
            n = scan.nextInt();
        }
        int[] mas = new int[n];
        for(int i=0; i< mas.length; i++) {
            mas[i] = rand.nextInt(n+1);
            System.out.print(mas[i]+" ");
            if(mas[i]%2==0){
                n2++;
            }
        }
        System.out.println();
        if(n2==0){
            System.out.println("В массиве нет чётных элементов!");
        }
        else {
            int [] mas2 = new int [n2];
                for( int j = 0, i =0; j<mas.length; j++ ){
                    if(mas[j]%2==0){
                        mas2[i]=mas[j];
                        if(i==n2){break;}
                        System.out.print(mas2[i]+" ");
                        i++;
                    }
            }
        }
    }
}
