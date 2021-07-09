import java.util.Scanner;

public class Unit1Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("\nВведите число программистов: ");
            int programmers = scan.nextInt();

            if (programmers % 10 == 1 & programmers % 100 != 11) {
                System.out.print(programmers + " программист");
            }
            else if (programmers % 10 >= 2 & programmers % 10 <= 4 & programmers%100 > 14) {
                System.out.print(programmers + " программиста");
            }
            else {
                System.out.print(programmers + " программистов");
            }
        }
    }
}