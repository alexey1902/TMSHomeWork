package Unit11.Unit11Task4;

import java.io.*;

public class Car implements Serializable {
    String label;
    double speed;
    int price;

    public Car() { }

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

    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Unit11/Unit11Task4/car.dat"))){
            Car bmw = new Car("BMW", 75, 5000);
            oos.writeObject(bmw);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Unit11/Unit11Task4/car.dat"))){
            Car newCar = (Car)ois.readObject();
            newCar.show();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
