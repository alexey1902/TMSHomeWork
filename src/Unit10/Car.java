package Unit10;

import java.util.Random;

public class Car {
    String label;
    double speed;
    int price;

    public Car() {
    }

    public Car(String label, double speed, int price) {
        this.label = label;
        this.speed = speed;
        this.price = price;
    }

    public String getLabel() { return label; }

    public double getSpeed() { return speed; }

    public int getPrice() { return price; }

    public void setLabel(String label) { this.label = label; }

    public void setSpeed(double speed) { this.speed = speed; }

    public void setPrice(int price) { this.price = price; }

    public void show(){
        System.out.println("Марка: " + this.getLabel());
        System.out.println("Скорость: " + this.getSpeed());
        System.out.println("Цена: " + this.getPrice());
    }

    public void start() throws CarException {
        Random random = new Random();
        int r = random.nextInt(21);
        if (r % 2 == 0) {
            throw new CarException("Машина " + getLabel() +" не завелась", r);
        }
        else{
            System.out.println("Машина " + getLabel() +" завелась");
        }
    }

    public void check(){
        try{
            this.start();
        }
        catch (CarException ex){
            System.out.println(ex.getMessage());
            System.out.println("Число - " + ex.getRandomNumber());
        }
        finally {
            System.out.println("Проверка пройдена!");
        }
    }

    public static void main(String[] args) {
        Car bmw = new Car("BMW", 75, 5000);
        Car mercedes = new Car("Mercedes", 80, 6000);
        bmw.check();
        mercedes.check();
    }
}
