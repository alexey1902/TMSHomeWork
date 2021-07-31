package Unit6;

public class Transport {
    int powerHorse;
    int maxSpeed;
    int mass;
    Label label;

    Transport() {
        this.powerHorse = this.maxSpeed = this.mass = 0;
    }

    Transport(int powerHorse, int maxSpeed, int mass, Label label) {
        this.powerHorse = powerHorse;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.label = label;
    }

    public int getPowerHorse() {
        return powerHorse;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMass() {
        return mass;
    }

    double powerKiloWatt() {
        return getPowerHorse() * 0.74;
    }

    void show() {
        System.out.println("Мощность л.с.: " + this.getPowerHorse() + "\n" +
                "Макс.скорость: " + this.getMaxSpeed() + "\n" +
                "Масса: " + this.getMass() + "\n" +
                "Мощность КВ: " + this.powerKiloWatt());
    }
}

