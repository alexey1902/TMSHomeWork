import java.util.Scanner;

public class Unit1Task1 {
    public static void main(String[] args){
        System.out.print("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) {
            System.out.print(number + " это отрицательное");
            number*=-1;
        }
        else {
            System.out.print(number + " это положительное");
        }
        if(number/10<1) {
            System.out.println(" однозначное число");
        }
        if(number/10>=1 & number/10<=9) {
            System.out.println(" двузначное число");
        }
        else if(number/100>=1 & number/100<=9) {
            System.out.println(" трёхзначное число");
        }
        else{
            System.out.println(" число, которое содержит более 3х знаков");
        }
    }
}
