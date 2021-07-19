package Unit3;

public class Unit3Task1 {
    public static void main(String[] args) {
         int mas[] = new int[10];
         for(int i = 2, j=0; i<22; i+=2, j++){
             mas[j] = i;
             System.out.print(mas[j]+" ");
         }
         System.out.println();
         for(int i =0; i<10; i++){
             System.out.println(mas[i]);
         }
    }
}
