package Unit7;

import Unit7.hands.*;
import Unit7.heads.*;
import Unit7.legs.*;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SamsungLeg samLeg = new SamsungLeg(1);
        SonyLeg    sonyLeg = new SonyLeg(5);
        ToshibaLeg toshibaLeg = new ToshibaLeg(10);

        SamsungHead samHead = new SamsungHead(5);
        SonyHead sonyHead = new SonyHead(10);
        ToshibaHead toshibaHead = new ToshibaHead(1);

        SamsungHand samsungHand = new SamsungHand(10);
        SonyHand sonyHand = new SonyHand(1);
        ToshibaHand toshibaHand = new ToshibaHand(5);

        Robot r1 = new Robot(samHead, samsungHand, toshibaLeg);
        Robot r2 = new Robot(toshibaHead, sonyHand, samLeg);
        Robot r3 = new Robot(sonyHead, samsungHand, toshibaLeg);

        System.out.println("Robot N1 action: ");
        r1.action();
        System.out.println("Robot N2 action: ");
        r2.action();
        System.out.println("Robot N3 action: ");
        r3.action();
        System.out.println("Robot N1 price: " + r1.getPrice());
        System.out.println("Robot N2 price: " + r2.getPrice());
        System.out.println("Robot N3 price: " + r3.getPrice());

        if(r1.getPrice()>= r2.getPrice() && r1.getPrice()>=r3.getPrice()){
                System.out.println("Самый дорогой робот: Robot N1");
        }
        if(r2.getPrice()>= r1.getPrice() && r2.getPrice()>=r3.getPrice()){
            System.out.println("Самый дорогой робот: Robot N2");
        }
        if(r3.getPrice()>= r1.getPrice() && r3.getPrice()>=r2.getPrice()){
            System.out.println("Самый дорогой робот: Robot N3");
        }
    }
}
