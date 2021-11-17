package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class InputService {

    public double getNumber() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Введена не цифра!\nВводите заново: ");
            }
        }
    }

    public int getIntNumber() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                return  scanner.nextInt();
            } else {
                System.out.print("Введена не цифра!\nВводите заново: ");
            }
        }
    }

    public int getPositiveNumber() {
        int positiveNumber;
        while (true) {
            positiveNumber = getIntNumber();
            if (positiveNumber >= 0) {
                return positiveNumber;
            } else {
                System.out.println("Данная переменная не может быть отрицательной!\nВводите заново: ");
            }
        }
    }

    public int checkNumber(int maxAllowed) {
        while (true) {
            System.out.print("Введите номер: ");
            int number = getPositiveNumber();
            if (number > maxAllowed) {
                System.out.println("Данного пункта меню нет!");
            } else {
                return number;
            }
        }
    }

    public boolean exit(){
        System.out.println("1 - Выйти\n2 - Продожить");
        return checkNumber(2) == 1;
    }
}
