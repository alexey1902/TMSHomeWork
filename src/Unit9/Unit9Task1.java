package Unit9;

import java.util.Scanner;

public class Unit9Task1 {
    public static void main(String[] args) {
        String str;
        char a;
        char b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        str = scanner.nextLine();
        System.out.println("Введите А и Б: ");
        a = scanner.next().charAt(0);
        b = scanner.next().charAt(0);
        if(str.indexOf(a)!=-1 && str.indexOf(b)!=-1) {
            str = str.substring(str.indexOf(a), str.indexOf(b));
            System.out.println("Новая строка: ");
            System.out.print(str);
        }
        else{
            System.out.println("Символов не нашлось!");
        }
    }
}
