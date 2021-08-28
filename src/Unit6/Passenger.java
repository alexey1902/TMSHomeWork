package Unit6;

public class Passenger extends Overland {
    int amountOfPassengers;

    Passenger() {
        super();
        this.amountOfPassengers = 0;
    }

    Passenger(int powerHorse, int maxSpeed, int mass, Label label, int wheels, int fuelRate, int amountOfPassengers) {
        super(powerHorse, maxSpeed, mass, label, wheels, fuelRate);
        this.amountOfPassengers = amountOfPassengers;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    void countRoute(double time) {
        System.out.println("За время " + time + " ч," + " автомобиль " + label.toString() +
                ", двигаясь с максимальной скоростью " + this.maxSpeed + " проедет " + time * this.maxSpeed +
                " км и израсходует " + ((time * this.maxSpeed) / 100) * fuelRate + " литров топлива");
    }

    @Override
    void show() {
        super.show();
        System.out.println("Количество пассажиров: " + this.getAmountOfPassengers());
    }

    public static void main(String[] args) {
        Passenger passenger = new Passenger(12, 7, 7, Label.Audi, 4, 10, 4);
        passenger.show();
        passenger.countRoute(2);
    }
}
