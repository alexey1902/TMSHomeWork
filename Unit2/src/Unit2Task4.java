import java.util.Scanner;

public class Unit2Task4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите А и Б: ");
            Scanner scan = new Scanner(System.in);
            int A = scan.nextInt(), B = scan.nextInt(), buf;
            if (A < 0 && B > 0) {
                buf = B;
                B = A;
                A = buf;
            }
            if (A < 0 && B < 0) {
                A = 0 - A;
                B = 0 - B;
            }
            buf = B;
            if (A != 0 & B != 0) {
                for (int i = 1; i < A; i++) {
                    B += buf;
                }
            }
            System.out.println(B);
        }
    }
}
