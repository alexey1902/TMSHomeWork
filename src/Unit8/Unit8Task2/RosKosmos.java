package Unit8.Unit8Task2;

import java.util.Random;

public class RosKosmos implements IStart {

    @Override
    public boolean preStart() {
        Random random = new Random();
        return random.nextInt(11) < 5;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шаттла RosKosmos запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла RosKosmos");
    }
}
