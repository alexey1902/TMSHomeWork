import java.util.Scanner;

public class Task4 {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите число: ");
            int sum =0, number = scan.nextInt(); number++;
            for (int i = 1; i < number; i++) {
                sum+=i;
            }
            System.out.println(sum);
        }
    }

