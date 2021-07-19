package Unit2;

public class Unit2Task8 {
    public static void main(String[] args) {
        int k =3;
        for(int i =0; i<4; i++){
            for(int j = 0; j<k; j++){
                System.out.print("  ");
            }
            k--;
            for(int n=0; n<(3-k); n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        k=4;
        for(int i =0; i<4; i++){
            for(int n=0; n<(4-k); n++) {
            System.out.print("  ");
            }
            for(int j = 0; j<k; j++){
                System.out.print("* ");
            }
            k--;
            System.out.println();
        }
    }
}
