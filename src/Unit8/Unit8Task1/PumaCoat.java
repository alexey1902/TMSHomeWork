package Unit8.Unit8Task1;

public class PumaCoat implements Coat{
    @Override
    public void takeOn() {
        System.out.println("Надета куртка Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка Puma");
    }
}
