public class Unit2Task3 {
    public static void main(String[] args) {
        int sum =1; int num =1;
        for(int i=1; i<9; i++) //1 2 4 8 16 32 64 128 256
        {
            num*=2;
            sum+=num;
        }
        System.out.println(sum);
    }
}
