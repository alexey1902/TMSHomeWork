package Unit8.Unit8Task2;

import java.util.Random;

public class SpaceX implements IStart {

    @Override
    public boolean preStart() {
        Random random = new Random();
        return random.nextInt(3) == 1;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шаттла SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла SpaceX");
    }
}
