package Unit6;

public class Overland extends Transport {
    int wheels;
    int fuelRate;

    Overland() {
        super();
        this.wheels = this.fuelRate = 0;
    }

    Overland(int powerHorse, int maxSpeed, int mass, Label label, int wheels, int fuelRate) {
        super(powerHorse, maxSpeed, mass, label);
        this.wheels = wheels;
        this.fuelRate = fuelRate;
    }

    public int getWheels() {
        return wheels;
    }

    public int getFuelRate() {
        return fuelRate;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Колёса: " + this.getWheels() +"\n" + "Расход топлива: " + this.getFuelRate());
    }
}
