package Unit3;

public class Unit3Task2 {
    public static void main(String[] args) {
        int mas[] = new int[50];
        for(int i = 1, j=0; i<101; i+=2, j++){
            mas[j] = i;
            System.out.print(mas[j]+" ");
        }
        System.out.println();
        for(int i = 49; i!=-1; i--){
            System.out.print(mas[i]+" ");
        }
    }
}
