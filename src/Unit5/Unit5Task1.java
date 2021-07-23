package Unit5;

import java.util.Random;
import java.util.Scanner;

public class Unit5Task1 {
    public static void main(String[] args) {
        Computer comp = new Computer("Intel", "DiskC", "64 Gb");
        comp.show();
        for (int i = 0; i < 10; i++) {
            comp.on();
            comp.off();
        }
    }
}

class Computer {
    String processor, disk, memory;
    int resource;
    boolean isBroken, isOn;

    void show() {
        System.out.println("Процессор - " + this.processor + "\n" +
                "Жёсткий диск - " + this.disk + "\n" +
                "Память - " + this.memory + "\n" +
                "Осталось ресурса - " + this.resource);
    }

    Computer() {
        this.processor = "undefined";
        this.disk = "undefined";
        this.memory = "undefined";
        this.resource = 0;
        this.isBroken = false;
        this.isOn = false;
    }

    Computer(String processor, String disk, String memory) {
        this.processor = processor;
        this.disk = disk;
        this.memory = memory;
        this.resource = 10;
        this.isBroken = false;
        this.isOn = false;
    }

    boolean notRight() {
        if (this.isBroken) {
            System.out.println("Компьютер сгорел!");
            return true;
        }
        if (this.resource == 0) {
            System.out.println("Кончился реусрс!Компьютер сгорел!");
            return true;
        }
        return false;
    }

    void on() {
        if (isOn) {
            System.out.println("Этот компьютер уже включен!");
        } else if (!notRight()) {
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            int r = rand.nextInt(2), compare;
            System.out.print("Включился?(0/1) - ");
            while (true) {
                compare = scan.nextInt();
                if (compare == 0 || compare == 1) {
                    break;
                }
                System.out.println("Неверное значение!\nВводите заново(0/1) - ");
            }
            if (compare != r) {
                this.isBroken = true;
                isOn = false;
            } else {
                isOn = true;
                resource--;
            }
        }
    }

    void off() {
        if (!isOn) {
            System.out.println("Этот компьютер уже выключен!");
        } else if (!notRight()) {
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            int r = rand.nextInt(2), compare;
            System.out.print("Выключился?(0/1) - ");
            while (true) {
                compare = scan.nextInt();
                if (compare == 0 || compare == 1) {
                    break;
                }
                System.out.println("Неверное значение!\nВводите заново(0/1) - ");
            }
            if (compare != r) {
                this.isBroken = true;
                isOn = false;
            } else {
                isOn = false;
                resource--;
            }
        }
    }
}