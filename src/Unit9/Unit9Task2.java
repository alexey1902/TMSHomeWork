package Unit9;

import java.util.Scanner;

public class Unit9Task2 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        str = scanner.nextLine();
        if(str.length()>3) {
            str = str.replace(str.charAt(3), str.charAt(0));
            System.out.println(str);
        }
        else{
            System.out.println("Строка слишком короткая!");
        }
    }
}
