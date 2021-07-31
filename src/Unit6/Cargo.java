package Unit6;

public class Cargo extends Overland{
    int loadCapacity;

    Cargo(){
        super();
        this.loadCapacity = 0;
    }

    Cargo(int powerHorse, int maxSpeed, int mass, Label label, int wheels, int fuelRate, int loadCapacity){
        super(powerHorse, maxSpeed, mass, label, wheels, fuelRate);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    void checkCapacity(int loadCapacity){
        if(loadCapacity<=this.getLoadCapacity()){
            System.out.println("Грузовик загружен");
        }else{
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    void show() {
        super.show();
        System.out.println("Грузоподъёмность: " + this.getLoadCapacity());
    }
}
