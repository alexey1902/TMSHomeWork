package Unit1;

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
            else if (programmers % 100 >= 2 & programmers % 100 <= 4 & (programmers%100 > 14 || programmers %100<12)) {
                System.out.print(programmers + " программиста");
            }
            else {
                System.out.print(programmers + " программистов");
            }
        }
    }
}